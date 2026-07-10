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
        ListNode dummy=new ListNode(-1,null);
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode curr=dummy;
        int carry=0;
        while (t1 != null || t2 != null) {
            int sum = carry;
            if (t1 != null) {
                sum = sum + t1.val;
                t1 = t1.next;  // Move t1 forward
            }
            if (t2 != null) {
                sum = sum + t2.val;
                t2 = t2.next;  // Move t2 forward
            }

            ListNode res=new ListNode((sum%10),null);
            curr.next=res;

            curr=curr.next;
            carry=sum/10;
        }
       

        if(carry!=0){
            ListNode last=new ListNode(carry,null);
            curr.next=last;

        }

        return dummy.next;
        
        
    }
}