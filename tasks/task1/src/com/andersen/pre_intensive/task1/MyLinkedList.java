package com.andersen.pre_intensive.task1;

public class MyLinkedList<T> implements MyArrayList<T> {

    int size = 0;
	private Node<T> firstNode;
    private Node<T> lastNode;

    public MyLinkedList() {
    }
    
    public Node<T> getFirstNode() {
		return firstNode;
	}

	public Node<T> getLastNode() {
		return lastNode;
	}

	private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
    }

    @Override
    // Добавление элемента в конец списка
    public void add(Object o) {
    	
    	Node<T> nod;
    	if (size == 0) {
    		nod = new Node((T) o, null, null);
    		firstNode = nod;
    		lastNode = nod;
    		System.out.println(firstNode + " " + lastNode);
    		size ++;
    	}
    	else {
    		nod = new Node((T) o, null, lastNode);
    		lastNode.next = nod;
    		lastNode = nod;
    		size ++;
    	}

    }

    @Override
    public void add(Object o, int index) {
    	
    	

    }

    @Override
    public void sort() {

    }

    @Override
    public void concat(MyArrayList<T> newList) {

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
