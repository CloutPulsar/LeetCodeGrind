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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1 == null && l2 == null)
            return null;
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        while(l1 != null && l2 != null)
        {
            int a = l1.val;
            int b = l2.val;
            dummy.next = new ListNode(Math.min(a,b));
            if(a < b)
                l1 = l1.next;
            else
                l2 = l2.next;
            dummy = dummy.next;
        }
        if(l1 == null)
            dummy.next = l2;
        else if(l2 == null)
            dummy.next = l1;
        return res.next;
    }
}
