package com.example.mosyalgorithms;

public class LengthOfCycle {
    private static class ListNode {
        int value = 0;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next.next;

        ListNode cycleNode = ifCycleReturnCycledNode(head);
        if (cycleNode != null) {
            ListNode startOfTheCycle = findStartOfTheCycle(head, cycleNode);
            System.out.println(startOfTheCycle.value);
        }
    }

    private static ListNode ifCycleReturnCycledNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return slow;
            }
        }
        return null;
    }

    private static ListNode findStartOfTheCycle(ListNode head, ListNode cycledNode) {
        while (!makeLapAndCheckPosition(head, cycledNode)) {
            head = head.next;
        }
        return head;
    }

    private static boolean makeLapAndCheckPosition(ListNode current, ListNode cycled) {
        ListNode fullLap = cycled;
        do {
            cycled = cycled.next;
            if (cycled == current) {
                return true;
            }
        } while (cycled != fullLap);
        return false;
    }
}
