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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode i=head;
        ListNode j=head;
        while(j.next!=null){
            j=j.next;
            if(j.val==i.val){
                i.next=j.next;
            }else{
                i=j;
            }
        }
        return head;
    }
}