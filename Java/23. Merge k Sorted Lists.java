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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        for(int i = 0; i < lists.length; i++)
        {
            while(lists[i] != null)
            {
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        while (!list.isEmpty())
        {
            dummy.next = new ListNode(list.remove());
            dummy = dummy.next;
        }
        return res.next;
    }
}
