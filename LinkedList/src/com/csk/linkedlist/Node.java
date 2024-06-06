package com.csk.linkedlist;

public class Node {

    int data;
    Node next;

    Node(int data) {

        this.data = data;
    }

    static void printElements(Node head) {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node insertAtBegin(Node head, int data) {

        Node node = new Node(data);

        node.next = head;
        head = node;

        return head;
    }

    static void insertAtEnd(Node head, int data) {

        Node node = new Node(data);
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = node;

    }

    static Node deleteFirstNode(Node head) {

        if (head.next != null) {

            head = head.next;
        }
        return head;
    }

    static void deleteLastNode(Node head) {

        Node prev = head;
        Node curr = head;

        while (curr.next != null) {

            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        printElements(head);

        System.out.println("\n---------------------");

        head = insertAtBegin(head, 5);
        printElements(head);

        insertAtEnd(head, 50);

        System.out.println("\n---------------------");

        printElements(head);

        head = deleteFirstNode(head);
        System.out.println("\n---------------------");

        printElements(head);

        deleteLastNode(head);

        System.out.println("\n---------------------");

        printElements(head);
    }
}
