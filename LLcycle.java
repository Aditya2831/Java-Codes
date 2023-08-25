/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean res=false;

        ListNode slow=head;
        ListNode fast=head;

        if(head==null || head.next==null){
            return false;
        }
        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;

             if(slow==fast){
                return true;
            }
        }
        return res;
    }
}