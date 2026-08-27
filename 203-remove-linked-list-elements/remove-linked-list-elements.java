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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode dummy=new ListNode(-1,head);
        ListNode prev=dummy;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
                temp=temp.next;
            }else{
                temp=temp.next;
                prev=prev.next;
            }
        }
        return dummy.next;
    }
}