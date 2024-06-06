package com.csk.linkedlist.problems;

public class NthNodeFromEnd {

    static void nthNodeFromEnd(Node head, int n) {
        int i = 0;

        Node first = head;

        while (first != null && i < n) {

            first = first.next;
            i++;
        }

        Node second = head;

        while (first != null) {

            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(35);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);

        nthNodeFromEnd(head, 3);
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }
}
