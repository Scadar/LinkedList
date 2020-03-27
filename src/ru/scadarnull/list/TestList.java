package ru.scadarnull.list;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        MyLinkedList<Integer> l2 = new MyLinkedList<>();
        l.push_back(322749);
        l.push_back(322749);
        l.push_back(322749);
        l.push_front(3);
        l.push_front(3);
        l.push_front(2);
        l.push_front(2);
        l.pop_back();
        l.pop_back();
        l2.push_front(322749);
        l2.push_front(322749);
        l2.push_front(322749);
        l2.push_front(3);
        l2.push_front(3);
        l2.push_front(2);
        l2.push_front(2);
        l2.pop_back();
        l2.pop_back();
        System.out.println(l.hashCode() + "");
        System.out.println(l2.hashCode() + "");
        System.out.println(l2.equals(l));
        System.out.println(l);
        System.out.println(l2);
    }
}
