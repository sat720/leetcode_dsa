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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode back = new ListNode(-1);
        back.next = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null &&fast.next != null){
            fast = fast.next.next;
            back=back.next;
            slow=slow.next;
        }
        back.next=slow.next;
        return head;
    }
}