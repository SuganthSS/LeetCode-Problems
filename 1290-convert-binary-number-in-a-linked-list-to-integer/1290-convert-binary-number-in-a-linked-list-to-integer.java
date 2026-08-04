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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null)
        {
            sb.append(temp.val);
            temp=temp.next;
        }
        int decimal = 0;
        String binary=sb.toString();
        for (int i = 0; i < binary.length(); i++) {
            decimal = (decimal << 1) + (binary.charAt(i) - '0');
        }
        return decimal;
    }
}