package org.example.level1;

import java.util.List;

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
public class merge21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        // Выбираем начальный узел для head

        while (current1 != null || current2 != null){
            if (current1 == null) {
                head.next = new ListNode(current2.val);
                current2 = current2.next;
            }
            else if (current2 == null) {
                head.next = new ListNode(current1.val);
                current1 = current1.next;
            }
            else if (current1.val <= current2.val) {
                head.next = new ListNode(current1.val);
                current1 = current1.next;
            } else {
                head.next = new ListNode(current2.val);
                current2 = current2.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
