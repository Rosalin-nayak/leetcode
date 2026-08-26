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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        for(int i=1;i<=n;i++){
            if(fast==null) return null;
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        return head;
    }
}