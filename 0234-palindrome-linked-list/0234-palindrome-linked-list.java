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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode headSecond=reverselist(mid);
        ListNode rereverseHead=headSecond;

        //compare both the halves
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                return false;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverselist(rereverseHead);
        
        return true;
    }

    public ListNode middleNode(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public ListNode reverselist(ListNode head){
        if(head==null){
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

}