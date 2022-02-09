package com.andersen.pre_intensive.task1;

import java.util.ArrayList;

public class MyArrayListImplementation implements MyArrayList {
    /*  предлагаю начать с этого:


        private Object[] internalArray;
        private int size = 0;
        private int startSize = 10;

    public MyTestListImpl() {
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
            int newSize = size() + newElementsCount;  //
            Object newInternalArray[] = new Object[newSize];
            newInternalArray = Arrays.copyOfRange(internalArray, 0, size());
            this.internalArray = newInternalArray;
        }
    }

    private void growInternalArray(){
        growInternalArray(1);
    }
     */

    @Override
    public void add(Object o) {

    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public void sort() {

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
        return 0;
    }
}
