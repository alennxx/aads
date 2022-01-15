package com.natgx.aads.datastructures.list;

interface List<T> {

    void add(T element) throws IllegalArgumentException;
    void add(int index, T element) throws IndexOutOfBoundsException, IllegalArgumentException;
    boolean contains(T element) throws IllegalArgumentException;
    T get(int index) throws IndexOutOfBoundsException;
    void remove(int index);
    int size();

}
