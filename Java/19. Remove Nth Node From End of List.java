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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode res = dummy;
        int count = 0;
        while(res != null)
        {
            count++;
            res = res.next;
        }
        count = count - n;
        res = dummy;
        while(count > 1)
        {
            count--;
            res = res.next;
        }
        res.next = res.next.next;
        return dummy.next;
    }
}
