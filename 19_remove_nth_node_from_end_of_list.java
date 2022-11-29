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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        ListNode target = head,prev = target;

        while(n>0){
            end = end.next;
            n = n - 1;
        } 
        while(end == null){
            return head.next;
        }  
        while(end != null){
            end = end.next;
            prev = target;
            target = target.next;
        }

        prev.next = target.next;
        return head;
    }
}
