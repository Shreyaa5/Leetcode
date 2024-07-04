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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode curr = head, temp = head.next, lastcheck = null;
        while(curr.next!=null)
        {
            sum=0;
            while(temp.val!=0)
            {
                sum+=temp.val;
                temp = temp.next;
            }
            curr.val = sum;
            curr.next = temp;
            lastcheck = curr;
            curr = curr.next;
            temp = curr.next;
            
        }
        lastcheck.next = null;
        return head;
    }
}