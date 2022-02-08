package com.andersen.pre_intensive.task1;

public interface MyArrayList<T> {

    void add(Object o);

    void add(Object o, int index);

    void sort();

    void concat(MyArrayList<T> newList);

    boolean delete(int index);

    T get(int index);

    int size();
}
