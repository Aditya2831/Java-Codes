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
    public ListNode reverse (ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode agla=null;

        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }



    public boolean isPalindrome(ListNode head) {
        //middle
        ListNode a=head;
        ListNode slow=head;
        ListNode fast=head;

        if(head==null || head.next==null){
            return true;
        }

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode rev=reverse(slow.next);
        slow.next=rev; //connecting the 2 LL

        while(slow.next!=null){
            if(a.val!=slow.next.val) return false;
            slow=slow.next;
            a=a.next;
        }

        return true;
    }
}