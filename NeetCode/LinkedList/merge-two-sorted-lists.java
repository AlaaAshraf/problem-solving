// problem: https://leetcode.com/problems/merge-two-sorted-lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedFinal = new ListNode();
        ListNode merged = mergedFinal;
        while(list1 != null && list2!=null){
            if(list1.val <= list2.val) {
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            merged = merged.next;
        }
        
        if(list1==null)
            list1 = list2;
        
        while(list1 != null){
            merged.next = new ListNode(list1.val);
            list1 = list1.next;
            merged = merged.next;
        }
        
        return mergedFinal.next;
    }
}
