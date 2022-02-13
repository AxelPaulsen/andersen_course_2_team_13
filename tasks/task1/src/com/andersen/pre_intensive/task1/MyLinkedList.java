package com.andersen.pre_intensive.task1;

public class MyLinkedList<T> implements MyArrayList<T> {

    int listSize = 0;
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
	
	// Method for print MyLinkedList elements to console
	public void printOut () {
		
		Node<T> element = firstNode;
		System.out.print(element + " ");
		
		for (int i = 0; i < listSize-1; i++) {
			element = element.next;
			System.out.print(element + " ");
		}
		System.out.println();
		
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

		// toString for Node class
        @Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
    }

    @Override
    // Add element to end of list
    public void add(Object o) {
    	
    	Node<T> nod;
    	if (listSize == 0) {
    		nod = new Node((T) o, null, null);
    		firstNode = nod;
    		lastNode = nod;
    		listSize ++;
    	}
    	else {
    		nod = new Node((T) o, null, lastNode);
    		lastNode.next = nod;
    		lastNode = nod;
    		listSize ++;
    	}

    }

   // Add element "o" to list before element with number "index"
    @Override
    public void add(Object o, int index) {
    	
    	if (index > listSize-1) {
    		throw new IndexOutOfBoundsException();
    	}
    	
    	if (index == listSize-1) {
    		this.add(o);
    	}
    	
    	if (index < listSize-1) {
    		System.out.println("вставляем перед " + index);
    		Node<T> replaceElement = firstNode;
    		for (int i = 0; i < index; i++) {
    			replaceElement = replaceElement.next;
    		}
    		
    		Node<T> newElement = new Node<> ((T) o, replaceElement, replaceElement.prev);
    		replaceElement.prev.next = newElement;
    		replaceElement.prev = newElement;
    		listSize ++;
    	
    	
    	}
		
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

    // Method return the list size
    @Override
    public int size() {
        return listSize;
    }
}
