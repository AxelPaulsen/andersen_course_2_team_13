package com.andersen.pre_intensive.task1;

public class MyLinkedList<T> implements MyArrayList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    public MyLinkedList() {
    }

    private static class Node<T> {
        T value;
        MyLinkedList.Node<T> next;
        MyLinkedList.Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

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
    public void concat(MyArrayList<T> newList) {

        // TODO: 12.02.2022 need to extract as toArray()
        Object[] ar = new Object[newList.size()];
        int i = 0;
        while (i < newList.size()) {
            ar[i] = newList.get(i);
        }

        for (Object o : ar) {
            T el = (T) o;
            Node<T> node = new Node<>(el, null, lastNode);
            lastNode.next = node;
            lastNode = node;
        }
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
