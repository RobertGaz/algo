package my.remove_nth_node_from_end_of_list;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headToReturn = head;
        int counter = 0;
        while (counter < n) {
            head = head.next;
            counter++;
        }
        ListNode nBeforePrev = null;
        ListNode nBefore = headToReturn;
        while (head != null) {
            head = head.next;
            nBeforePrev = nBefore;
            nBefore = nBefore.next;
        }
        if (nBeforePrev == null) {
            return headToReturn.next;
        }
        nBeforePrev.next = nBefore.next;

        return headToReturn;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        removeNthFromEnd(one, 2);

    }
}