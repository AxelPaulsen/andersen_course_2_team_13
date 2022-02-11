package com.andersen.pre_intensive.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayListImplementation<T> implements MyArrayList<T> {

    private T[] internalArray;
    private int size = 0;
    private int startSize = 10;

    public MyArrayListImplementation() {
        Object[] newArray = new Object[startSize];
        this.internalArray = (T[])newArray;
    }

    public MyArrayListImplementation(Class<T> type, int size){
        this.internalArray = (T[]) Array.newInstance(type, size);
        this.size = size;
    }

    public MyArrayListImplementation(Class<T> type){
        this.internalArray = (T[])Array.newInstance(type, startSize);

    }

    public boolean isEmpty(){
       return size == 0;
    }

    private void growInternalArray(int newElementsCount){
        if (isEmpty()) {
            Object newInternalArray[] = new Object[this.startSize];
            this.internalArray = (T[])newInternalArray;
        } else {
            int newSize = size() + newElementsCount;
            Object newInternalArray[];
            newInternalArray = Arrays.copyOf(internalArray, newSize);
            this.internalArray = (T[])newInternalArray;
        }
    }

    private void growInternalArray(){
        growInternalArray(1);
    }


    @Override
    public void add(Object o) {
        if (o == null) {
            return;
        }
        if (size() < internalArray.length) {
            internalArray[(size() - 1) + 1] = (T)o;
            this.size++;
        } else {
            growInternalArray();
            internalArray[(size() - 1) + 1] = (T)o;
            this.size++;
        }
    }

    @Override
    public void add(Object o, int index) {
        if ((o == null) || (index < 0)) {
            return;
        }
        if ((size()-1) < index) {
            add(o);
            return;
        }
        int newSize = size()+1;

        if (size() >= internalArray.length) growInternalArray();

        if (index == 0) {
            Object[] newInternalArray = new Object[newSize];
            newInternalArray[0] = o;
            System.arraycopy(internalArray, 0, newInternalArray, 1, size());
            this.internalArray = (T[])newInternalArray;
            this.size++;

        }else{
            Object[] newInternalArray = new Object[newSize];

            System.arraycopy(internalArray, 0, newInternalArray, 0, index);
            System.arraycopy(internalArray, index, newInternalArray, index+1, size()-index);
            newInternalArray[index] = o;
            this.internalArray = (T[])newInternalArray;
            this.size++;
        }
    }

    @Override
    public void sort() {
        Arrays.sort(this.internalArray);
    }

    @Override
    public void concat(MyArrayList<T> newList) {

        if (internalArray.length < size + newList.size()) {
            growInternalArray(newList.size() - (internalArray.length - size));
        }

        for (int i = 0; i < newList.size(); i++) {
            internalArray[size + i] = newList.get(i);
        }
        size += newList.size();
    }

    @Override
    public boolean delete(int index) {
        if ((isEmpty()) || (index < 0) || (index >= size())) return false;

        System.arraycopy(internalArray, index+1, internalArray, index, size()-1-index);
        internalArray[size()-1]=null;
        this.size--;
        return true;
    }

    @Override
    public T get(int index) {
        if ((isEmpty()) || (index < 0) || (index >= size())) return null;
        return this.internalArray[index];
    }

    @Override
    public int size() {
        return this.size;
    }
}
