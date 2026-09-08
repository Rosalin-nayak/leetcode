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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode odd=d1;
        ListNode even=d2;
        int position=1;
        while(head!=null){
            if(position%2==0){
                even.next=head;
                even=even.next;
            }else{
                odd.next=head;
                odd=odd.next;
            }
            head=head.next;
            position++;
        }
        even.next=null;
        odd.next=d2.next;
        return d1.next;
    }
}