package ru.scadarnull.list;

import java.util.Objects;

public class Node<T> {
    private Node<T> prev;
    private Node<T> next;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        boolean result = false;
        if (o instanceof Node) {
            Node<T> other = (Node<T>)o;
            if(this.getValue().equals(other.getValue()))
                result = true;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
