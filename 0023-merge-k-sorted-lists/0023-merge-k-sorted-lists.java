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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ArrayList<ListNode> ans=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ans.add(lists[i]);
        }
        while(ans.size()>1){
            ListNode a=ans.get(ans.size()-1);
            ans.remove(ans.size()-1);
            ListNode b=ans.get(ans.size()-1);
            ans.remove(ans.size()-1);
            ListNode c=merge(a,b);
            ans.add(c);
        }
        return ans.get(0);
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode d=new ListNode(-1);
        ListNode k=d;
        ListNode i=head1;
        ListNode j=head2;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next=i;
                i=i.next;
            }else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i!=null) k.next=i;
        else k.next=j;
        return d.next;
    }
}