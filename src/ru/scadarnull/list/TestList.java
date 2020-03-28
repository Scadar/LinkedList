package ru.scadarnull.list;

import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l2 = new MyLinkedList<>();
        l2.push_back(1);
        l2.push_back(2);
        l2.push_back(3);
        l2.pop_front();
        l2.pop_back();

        System.out.println(l2);

    }
}
