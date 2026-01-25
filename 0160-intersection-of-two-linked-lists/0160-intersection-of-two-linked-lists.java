/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode node1 = headA;
        ListNode node2 = headB;

        int len1 = 0;
        int len2 = 0;

        while (node1 != null) {
            len1++;
            node1 = node1.next;
        }

        while (node2 != null) {
            len2++;
            node2 = node2.next;
        }

        node1 = headA;
        node2 = headB;

        int min = Math.abs(len1 - len2);
        if (len1 > len2) {
            for (int i = 0; i < min; i++) {
                node1 = node1.next;
            }
        } 
        
        else {
            for (int i = 0; i < min; i++) {
                node2 = node2.next;
            }
        }

        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;
    }
}