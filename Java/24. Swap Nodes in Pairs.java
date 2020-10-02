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
class Solution {
    public ListNode swapPairs(ListNode head)
    {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        
        while(current.next != null && current.next.next != null)
        {
            ListNode node1 = current.next; // 1
            ListNode node2 = current.next.next; // 2
            node1.next = node2.next; //1 -> 3
            current.next = node2; // () -> 2 
            node2.next = node1; // 2 -> 1
            
            current = current.next.next; // () -> 2 -> 1 -> 3
        }
        return dummy.next;
        
    }
}
