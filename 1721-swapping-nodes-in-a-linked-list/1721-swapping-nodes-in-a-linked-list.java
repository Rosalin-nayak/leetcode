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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode begin=head;
        ListNode fast=head;
        ListNode end=head;
        for(int i=1;i<k;i++){
            begin=begin.next;
            fast=fast.next;
        }
        while(fast.next!=null){
            end=end.next;
            fast=fast.next;
        }
        int val=end.val;
        end.val=begin.val;
        begin.val=val;
        return head;
    }
}