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
        int tempvalue=0;
        while(head!=null)
        {
            if(head.val==head.next.val)
            {
                head=head.next;
                tempvalue=head.val;
            }
            if(head.val==tempvalue)
            {
                head=head.next;
            }
        }
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val==temp.next.val)
            {
                temp=temp.next;
                
            }
        }
    }
}