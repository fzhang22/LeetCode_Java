package Recursion;

// Given a linked list, swap every two adjacent nodes and return its head.
// You may not modify the values in the list's nodes, only nodes itself may be changed.
// E.g Given 1->2->3->4, you should return the list as 2->1->4->3.

import java.util.LinkedList;

public class SwapNodeInPairs {

    public static void main(String[] args) {

        // define the LinkedList 1->2->3->4
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;

        // swap the Node to become 2->1->4->3
        ListNode newHead = SwapNodeInPairs(head);
        System.out.println(newHead.val);

    }

    public static class ListNode {

        // data field
        int val;
        ListNode next;

        // constructor
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode SwapNodeInPairs(ListNode head) {

        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // stored the head.next as Node n
        ListNode n = head.next;

        // recursion step: head.next -> next new head after swap
        head.next = SwapNodeInPairs(head.next.next);

        // Node n point to the old head
        n.next = head;

        return n;

    }









}
