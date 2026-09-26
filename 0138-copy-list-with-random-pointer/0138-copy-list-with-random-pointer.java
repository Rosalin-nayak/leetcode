/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopy(Node head1){
        Node temp1=head1;
        Node head2=new Node(-1);
        Node temp2=head2;
        while(temp1!=null){
            Node t=new Node(temp1.val);
            temp2.next=t;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return head2.next;
    }
    public Node copyRandomList(Node a) {
        Node b=deepCopy(a);
        HashMap<Node,Node> map=new HashMap<>();
        Node tempA=a;
        Node tempB=b;
        while(tempA!=null){
            map.put(tempA,tempB);
            tempA=tempA.next;
            tempB=tempB.next;
        }
        tempA=a;
        while(tempA!=null){
            tempB=map.get(tempA);
            tempB.random=map.get(tempA.random);
            tempA=tempA.next;
        }
        return b;
    }
}