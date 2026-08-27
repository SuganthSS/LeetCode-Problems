/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }
    private Node dfs(Node temp)
    {
        Node pre=null;
        while(temp!=null)
        {
            pre=temp;
            if(temp.child != null)
            {
                Node tail=dfs(temp.child);
                tail.next=temp.next;
                if(temp.next!=null)
                {
                    temp.next.prev=tail;
                }

                temp.next=temp.child;
                temp.child.prev=temp;
                temp.child=null;

                temp=tail.next;
                pre=tail;
            }
            else
            {
                temp=temp.next;
            }
        }
        return pre;
    }
}