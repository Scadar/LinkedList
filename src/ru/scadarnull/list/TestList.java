package ru.scadarnull.list;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.push_back(5);
        System.out.println(l);
        System.out.println(l.pop_front());

        System.out.println(l);
    }
}
