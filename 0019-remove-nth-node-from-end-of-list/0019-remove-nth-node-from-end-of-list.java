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
    // public static int Length(ListNode head){
    //     int count=0;
    //     ListNode temp = head;
    //     while(temp!=null){
    //         temp=temp.next;
    //         count++;
    //     }

    //     return count;
    // }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null || head.next==null) return null;

        

    //     int length=Length(head);

    //     int result=length-n;

    //     if(result==0){
    //         head=head.next;
    //         return head;
    //     }

    //     ListNode temp = head;
    //     for(int i =1;i<result;i++){
    //         temp=temp.next;
    //     }

    //     temp.next=temp.next.next;

        
    //     return head;
        
    // }

        ListNode fast = head;
        for(int i =0 ;i<n;i++){
            fast=fast.next;
        }

            // If fast is null, we need to remove head
        if (fast == null) {
            return head.next;
        }
        ListNode slow=head;

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next = slow.next.next;

        return head;
    
}

}