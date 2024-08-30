package com.example.data.structures;

public class LinkedListNode<T> {
    private T node;

    private LinkedListNode<T> next;

    public LinkedListNode(T node) {
        this.node = node;
        this.next = null;
    }

    public LinkedListNode(T node, LinkedListNode<T> next) {
        this.node = node;
        this.next = next;
    }
    
    public T getNode() {
        return node;
    }

    public void setNode(T node) {
        this.node = node;
    }

    public LinkedListNode<T> getNext() {
        return this.next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }
}
