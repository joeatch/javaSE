package com.datastructure.genericclasses;
//泛型接口(由Teacher和Student来实现）
public interface Data<E> {
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
