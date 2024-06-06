package com.csk.ds.recursion.leetcode.problems.easy;

import java.util.List;

public class MergeTwoLinkedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode res = new ListNode();
        ListNode temp = res;

        return merge(list1, list2, res, temp);

    }

    /*
    Recursive Method
     */
    static ListNode merge(ListNode l1, ListNode l2, ListNode res, ListNode temp) {

        if (l1 != null && l2 != null) {
            if (l1.val == l2.val) {
                temp.val = l1.val;
                temp.next = new ListNode(l1.val);
                temp = temp.next;

                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1.val < l2.val) {
                temp.val = l1.val;

                l1 = l1.next;
            }
            else {
                temp.val = l2.val;

                l2 = l2.next;
            }
        }
        else if (l1 != null) {
            temp.val = l1.val;

            l1 = l1.next;
        }
        else if (l2 != null) {
            temp.val = l2.val;

            l2 = l2.next;
        }

        if (l1 == null && l2 == null) {
            return res;
        }
        else {
            temp.next = new ListNode();
            temp = temp.next;
        }

        return merge(l1, l2, res, temp);
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        var res = mergeTwoLists(null, l2);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }


    }

    static class ListNode {
        int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
