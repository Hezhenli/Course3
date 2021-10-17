package dao;

import java.util.List;
import java.io.Serializable;

public interface IBaseDao<T> {
    //保存
    void save(T s);
    void update(T s);
    void delete(Serializable i);
    T getOne(Serializable i);
    List<T> getAll();
}
