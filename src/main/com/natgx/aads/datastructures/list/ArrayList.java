package com.natgx.aads.datastructures.list;

import java.util.Arrays;

class ArrayList<T> implements List<T> {

    private static final int INITIAL_SIZE = 5;

    private Object[] mElements;
    private int mSize;

    protected ArrayList() {
        this(INITIAL_SIZE);
    }

    protected ArrayList(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("List has to be initialized using positive size value.");
        }
        mElements = new Object[initialSize];
        mSize = 0;
    }

    @Override
    public void add(T element) {
        add(mSize, element);
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > mSize) {
            throw new IndexOutOfBoundsException(getIndexOutOfBoundsMessage(index));
        }
        if (element == null) {
            throw new IllegalArgumentException("Null can not be stored in a list.");
        }
        int size = mSize == mElements.length ? mSize + 1 : mElements.length;
        Object[] elements = new Object[size];
        int i = 0;
        while (i < index) {
            elements[i] = mElements[i];
            i++;
        }
        elements[i] = element;
        while(i < mSize) {
            elements[i+1] = mElements[i];
            i++;
        }
        mElements = elements;
        mSize++;
    }

    @Override
    public boolean contains(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Null can not be stored in a list.");
        }
        if (mSize == 0) {
            return false;
        }
        int i = 0;
        while (i < mSize && !mElements[i].equals(element)) {
            i++;
        }
        return i < mSize;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return mSize;
    }

    private String getIndexOutOfBoundsMessage(int index) {
        return "Index " + index + " is out of bounds";
    }
}
