package cn.japgmer.repository;

import cn.japgmer.po.User;

import java.io.Serializable;
import java.util.List;

public interface DomainRepository<T,PK extends Serializable>{
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    List<T> verifyUsrPwd(T entity);

    void persist(T entity);

    PK save(T entity);

    void saveOrupdate(T entity);

    void delete(PK id);

    void flush();
}
