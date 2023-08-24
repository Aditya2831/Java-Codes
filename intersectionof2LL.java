public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        ListNode res = null; 

        int sizeA = 0;
        int sizeB = 0;

        while (tempA != null) {
            sizeA += 1;
            tempA = tempA.next;
        }

        while (tempB != null) {
            sizeB += 1;
            tempB = tempB.next;
        }

        int diff = Math.abs(sizeA - sizeB);  
        tempA = headA;
        tempB = headB;
        if (sizeA > sizeB) {
            for (int i = 0; i < diff; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                tempB = tempB.next;
            }
        }

       
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                res = tempA;  
                break;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return res;
    }
}
