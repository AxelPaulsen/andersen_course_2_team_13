package com.andersen.pre_intensive.task1;

import java.util.Arrays;

public class MyArrayListImplementation implements MyArrayList {

    private Object[] internalArray;
    private int size = 0;
    private int startSize = 10;

    public MyArrayListImplementation() {
        Object[] newArray = new Object[startSize];
        this.internalArray = newArray;
    }
    public boolean isEmpty(){
        if (size == 0) return true;
        else return false;
    }

    private void growInternalArray(int newElementsCount){
        if (isEmpty()) {
            Object newInternalArray[] = new Object[this.startSize];

        } else {
            int newSize = size() + newElementsCount;
            Object newInternalArray[];
            newInternalArray = Arrays.copyOf(internalArray, newSize);
            this.internalArray = newInternalArray;
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
        if (size() < internalArray.length){
            internalArray[(size()-1)+1] = o;
            this.size++;
        }else {
            growInternalArray();
            internalArray[(size()-1)+1] = o;
            this.size++;
        }


    }

    @Override
    public void add(Object o, int index) {
        if ((o == null) || (index < 0)) return;
        if ((size()-1) < index) {
            add(o);
            return;
        }
        if (size() >= internalArray.length) growInternalArray();

        int newSize = size()+1;

        if (index == 0) {
            Object[] newInternalArray = new Object[newSize];
            newInternalArray[0] = o;
            System.arraycopy(internalArray, 0, newInternalArray, 1, size());
            this.internalArray = newInternalArray;
            this.size++;

        }else{
            Object[] newInternalArray = new Object[newSize];

            System.arraycopy(internalArray, 0, newInternalArray, 0, index);
            System.arraycopy(internalArray, index, newInternalArray, index+1, size()-index);
            newInternalArray[index] = o;
            this.internalArray = newInternalArray;
            this.size++;
        }
    }

    @Override
    public void sort() {
        Arrays.sort(this.internalArray);
    }

    @Override
    public void concat(MyArrayList newList) {

    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }
}
