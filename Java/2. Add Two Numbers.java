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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return null;
        ListNode tmp = new ListNode();
        ListNode head = tmp;
        int carry = 0;
        while(l1 != null || l2 != null)
        {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            if((carry + x + y) > 9)
            {
                tmp.next = new ListNode((carry + x + y)%10);
                carry = 1;
            }
            else
            {
                tmp.next = new ListNode(carry + x + y);
                carry = 0;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            tmp = tmp.next;
        }
        if(carry > 0)
            tmp.next = new ListNode(carry);
        return head.next;
            
    }
}
