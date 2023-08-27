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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;

        ListNode head=new ListNode(0);
        ListNode temp=head;

    //   if(list1==null && list2==null) return null;
    //   if(list1==null) return list2;
    //   if(list2==null) return list1;

        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }

            else
            {
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;  
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        if(temp2==null){
            temp.next=temp1;
        }

        return head.next;
    }
}