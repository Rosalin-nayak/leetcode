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
    public ListNode removeNodes(ListNode head){
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.size()==0) st.push(temp);
            else{
                if(temp.val<st.peek().val){
                    st.push(temp);
                }else{
                    while(st.size()>0 && st.peek().val<temp.val){
                        st.pop();
                    }
                    st.push(temp);
                }
            }
            temp=temp.next;
        }
        
        while(st.size()>0){
            ListNode top=st.pop();
            top.next=temp;
            temp=top;
        }
        return temp;
    }
}