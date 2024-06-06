package com.csk.linkedlist.problems;

import com.csk.linkedlist.Node;

class MiddleNode {

    int data;
    MiddleNode next;

    MiddleNode(int data) {

        this.data = data;
    }

    static void printMiddle(MiddleNode head) {

        MiddleNode slow = head;
        MiddleNode fast = head;

        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }

    public static void main(String[] args) {

        MiddleNode head = new MiddleNode(10);
        head.next = new MiddleNode(20);
        head.next.next = new MiddleNode(30);
        head.next.next.next = new MiddleNode(35);
        head.next.next.next.next = new MiddleNode(40);
        head.next.next.next.next.next = new MiddleNode(50);

        printMiddle(head);
    }
}
