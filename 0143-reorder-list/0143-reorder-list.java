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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode hs=reverselist(mid);
        ListNode start=head;
        while(start!=null && hs!=null){
            ListNode temp=start.next;
            start.next=hs;
            start=temp;

            temp=hs.next;
            hs.next=start;
            hs=temp;
        }
        
        if(start!=null){
            start.next=null;
        }
    }
    public ListNode reverselist(ListNode head){
        if(head==null ||head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    public ListNode middleNode(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}