package com.csk.ds.recursion.leetcode.problems.medium;

import com.csk.ds.recursion.leetcode.problems.domain.ListNode;

/*
   @link = https://leetcode.com/problems/swap-nodes-in-pairs/description/
 */
public class SwapNodePairs {


    public static ListNode swapPairs(ListNode head) {

        ListNode temp = head;

        swap(temp, temp.next, temp.next.next);

        return head;
    }

    static ListNode swap(ListNode prev, ListNode curr, ListNode next) {
        if (curr == null || next == null) {
            return curr;
        }

        // 1 -> 2 -> 3 -> 4
        // 1 -> 3 -> 4
        // 2 -> 1 -> 3 -> 4


        // 2 -> 1 -> 3
        // 2 -> 1 -> 4
        // 2 -> 1 -> 4 -> 3

        prev.next = next;
        curr.next = prev;


        return swap(prev, next, next.next);
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);

        var res = swapPairs(l);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}
