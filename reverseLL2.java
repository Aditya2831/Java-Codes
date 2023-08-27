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
    public ListNode reverseList(ListNode head) {
        ListNode agla=null;
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
}