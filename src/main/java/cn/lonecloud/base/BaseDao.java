package cn.lonecloud.base;

import java.util.List;

/**
 * Created by lonecloud on 17/4/17.
 */
public interface BaseDao<E> {

    public void insert(E e);

    public void update(E e);

    public void delete(E e);

    public void deleteById(String id);

    public List<? extends Object> query(Object... args);

    public E queryById(String id);
}
