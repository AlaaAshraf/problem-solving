// problem: https://leetcode.com/problems/reverse-linked-list
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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode res = new ListNode(head.val);
        while(head.next!=null){
            head = head.next;
            res = new ListNode(head.val, res);
        }
        return res;
    }
}