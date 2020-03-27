package ru.scadarnull.list;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.push_back(5);
        l.push_back(4);
        l.push_back(12);
        l.push_front(0);
        System.out.println(l);
    }
}
