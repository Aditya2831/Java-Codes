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

    public static ListNode reverse(ListNode head){
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
    public int pairSum(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
         ListNode temp=head;
        int count=0;

          if(head==null || head.next==null) return 0;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode rev=reverse(slow.next);
        slow.next=rev;
        ListNode temp2=slow.next;

          
        while(temp2!=null){
            if(temp.val+temp2.val>count){
                count=temp.val+temp2.val;
            }
            temp2=temp2.next;
            temp=temp.next;
            
        }

        return count;
    }
}