package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/7
 */
public interface Super<T> {

    void delete(int index);

    void add(T data);

    T get(int index);

    void update(int index, T newData);

    void print();

    int size();

}
