package ru.scadarnull.list;

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
            first = node;
            last = node;
        }else{
            node.setNext(first);
            first.setPrev(node);
            first = node;
        }
        size++;
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
}
