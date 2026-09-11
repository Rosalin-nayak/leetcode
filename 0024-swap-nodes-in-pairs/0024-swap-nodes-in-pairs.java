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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode d1=dummy1;
        ListNode d2=dummy2;
        while(temp!=null){
            d1.next=temp;
            d1=temp;
            temp=temp.next;
            d2.next=temp;
            d2=temp;
            if(temp!=null) temp=temp.next;
        }
        d1.next=null; d1=null;
        if (d2!=null) d2.next=null; 
        d2=null;

        ListNode t1=dummy1.next;
        ListNode t2=dummy2.next;
        head=t2;
        while(t2!=null){
            d2=t2.next;
            d1=t1.next;
            t2.next=t1;
            if(d2!=null) t1.next=d2;
            t1=d1;
            t2=d2;
        }
        return head;
    }
}