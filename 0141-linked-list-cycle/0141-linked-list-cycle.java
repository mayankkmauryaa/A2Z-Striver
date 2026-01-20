/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}

class Solution_Map {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        map.put(head, 1);
        while (head != null) {
            if (map.containsKey(head.next)) {
                return true;
            } else {
                map.put(head.next, 1);
            }
            head = head.next;
        }
        return false;
    }
}