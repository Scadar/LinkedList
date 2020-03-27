package ru.scadarnull.list;

import java.util.Objects;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    public MyLinkedList(){}

    public void push_back(T value){
        Node<T> node = new Node<>(value);
        if(size == 0){
            first = last = node;
        }else{
            last.setNext(node);
            node.setPrev(last);
            last = node;
        }
        size++;
    }

    public void push_front(T value){
        Node<T> node = new Node<>(value);
        if(size == 0){
            first = last = node;
        }else{
            node.setNext(first);
            first.setPrev(node);
            first = node;
        }
        size++;
    }

    public T pop_back(){
        T result = null;
        if(size != 0) {
            result = last.getValue();
            Node<T> node = last.getPrev();
            last = node;
            if(node != null)
                node.setNext(null);
            size--;
        }
        if(size == 0)
            first = last = null;
        return result;
    }

    public T pop_front(){
        T result = null;
        if(size != 0) {
            result = first.getValue();
            Node<T> node = first.getNext();
            first = node;
            if(node != null)
                node.setPrev(null);
            size--;
        }
        if(size == 0)
            first = last = null;
        return result;
    }

    @Override
    public String toString() {
        Node<T> current = first;
        StringBuilder str = new StringBuilder();
        while(current != null){
            str.append(current.getValue()).append(" ");
            current = current.getNext();
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        boolean result = true;

        if (o instanceof MyLinkedList) {
            MyLinkedList<T> other = (MyLinkedList<T>) o;
            if(this.getSize() != other.getSize())
                return false;
            Node<T> current = first;
            Node<T> current2 = other.first;
            while(current != null){
                if(!current.getValue().equals(current2.getValue())){
                    result = false;
                    break;
                }
                current = current.getNext();
                current2 = current2.getNext();
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last, size);
    }

    public int getSize(){
        return size;
    }
}
