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
    public Node copyRandomList(Node head) {
        Node curr=head;
        Node prev=null;
        Node result=null;

        Map<Node,Node> map=new HashMap<>();
        while(curr!=null)
        {
            Node newNode= new Node(curr.val);
            map.put(curr,newNode);
            if(prev==null)
            {
                result=newNode;
            }
            else
            {
                prev.next=newNode;
            }

            prev=newNode;
            curr=curr.next;
        }

        curr=head;
        Node temp=result;

        while(curr != null)
        {
            temp.random = map.get(curr.random);
            curr=curr.next;
            temp=temp.next;
        }

        return result;
    }
}