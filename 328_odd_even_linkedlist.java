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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode odd_node = head; 
        ListNode even_node = head.next;
        ListNode even_head = head.next;

        while(even_node != null && even_node.next != null){
            odd_node.next = odd_node.next.next;
            even_node.next = even_node.next.next;

            odd_node = odd_node.next;
            even_node = even_node.next;
        }
        odd_node.next = even_head;
        return head;
    }
}
