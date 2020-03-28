package ru.scadarnull.list;

import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        MyLinkedList<Integer> l2 = new MyLinkedList<>();

        l.push_back(12);


        l2.push_back(12);


        System.out.println(l2.equals(l));
        System.out.println(l2.hashCode());
        System.out.println(l.hashCode());
    }
}
