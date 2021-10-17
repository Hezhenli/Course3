import dao.impl.StudentDao;
import entity.Student;
import org.junit.Test;

import java.util.List;

public class StudentDaoTest {
    StudentDao sDao = new StudentDao();
    @Test
    public void create() {
        Student s1 = new Student();
        s1.setName("小王");
        s1.setId("20101112334");
        s1.setPassword("123456");
        sDao.save(s1);
    }

    @Test
    public void delete(){
        sDao.delete("20101112334");
    }



}
