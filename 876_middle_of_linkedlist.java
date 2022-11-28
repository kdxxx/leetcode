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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast !=null && fast.next != null){
            slow = slow.next; // when fast is at the end of the linkedlist, slow is the middle 
            fast = fast.next.next; // gets the end of the linkedlist firstly.
        }
        return slow;
    }
}
// https://www.geeksforgeeks.org/linked-list-in-java/
// https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
