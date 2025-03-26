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

    static ListNode helper(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public ListNode reverseList(ListNode head) {
        return helper(head);
    }
}