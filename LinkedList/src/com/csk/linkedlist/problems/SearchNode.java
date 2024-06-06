package com.csk.linkedlist.problems;

class SearchNode {

    int data;
    SearchNode next;

    SearchNode(int data) {

        this.data = data;
    }

    static boolean searchIterative(SearchNode head, int elem) {

        SearchNode curr = head;

        while (curr != null) {

            if (curr.data == elem) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    static boolean searchRecursive(SearchNode head, int elem) {

        if (head == null) {
            return false;
        }

        if (head.data == elem) {
            return true;
        }

        return searchRecursive(head.next, elem);
    }

    public static void main(String[] args) {

        SearchNode head = new SearchNode(10);
        head.next = new SearchNode(20);
        head.next.next = new SearchNode(30);
        head.next.next.next = new SearchNode(35);
        head.next.next.next.next = new SearchNode(40);
        head.next.next.next.next.next = new SearchNode(50);

        System.out.println(searchIterative(head, 10));
        System.out.println(searchIterative(head, 70));

        System.out.println("--- Searching Recursively ----");

        System.out.println(searchRecursive(head, 10));
        System.out.println(searchRecursive(head, 70));


    }

}
