package com.example.data.structures;

public class LinkedList<T> {
    private LinkedListNode<T> first;
    private int size;

    public LinkedList() {
        first = new LinkedListNode<T>(null);
        size = 0;
    }

    public void Add(T node) {
        if(size == 0) {
            first = new LinkedListNode<T>(node);
            size++;
            return;
        }
        
        LinkedListNode<T> lastElement = first;
        while(lastElement.getNext() != null)
            lastElement = lastElement.getNext();
        lastElement.setNext(new LinkedListNode<T>(node));

        size++;
    }

    public T PopElement(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        
        T node;
        if(index == 0) {
            node = first.getNode();
            first = first.getNext();
            size--;
            return node;
        }
        
        LinkedListNode<T> nodePointer = first;
        for(int i = 0; i < index - 1; i++)
            nodePointer = nodePointer.getNext();
        LinkedListNode<T> indexedElement = nodePointer.getNext();
        node = indexedElement.getNode();
        nodePointer.setNext(indexedElement.getNext());

        size--;

        return node;
    }

    public T PopLast() {
        if(size == 0)
            return null;

        T node = null;
        if(size == 1) {
            node = first.getNode();
            first = null;
            size = 0;
            return node;
        }
        
        LinkedListNode<T> previousElement = first;
        LinkedListNode<T> lastElement = first.getNext();
        while(lastElement.getNext() != null) {
            previousElement = previousElement.getNext();
            lastElement = lastElement.getNext();
        }

        node = lastElement.getNode();

        previousElement.setNext(null);

        size--;
        
        return node;
    }

    public T PopFirst() {
        if(size == 0)
            return null;
        
        T node = first.getNode();

        first = first.getNext();

        size--;
        
        return node;
    }

    public int Size() {
        return size;
    }

    public void Print() {
        LinkedListNode<T> pointer = first;
        System.out.print("[");
        for(int i = 0; i < size; i++, pointer = pointer.getNext()) {
            if(i == size - 1)
                System.out.println(pointer.getNode() + "]");
            else
                System.out.print(pointer.getNode() + ", ");
        }
    }
}
