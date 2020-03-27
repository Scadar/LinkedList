package ru.scadarnull.list;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        MyLinkedList<Integer> l2 = new MyLinkedList<>();

        l.push_back(12);
        l.push_back(15);
        l.push_back(1);
        l.push_back(2);
        System.out.println(l.getItem(5));
        System.out.println(l.setItem(-1, 100));
        System.out.println(l);
        System.out.println(l2);
    }
}
