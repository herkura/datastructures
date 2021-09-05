//Given the head of a linked list, remove the nth node from the end of the list and return its head.
// For eg: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
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
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode fast = dummy;
      ListNode slow = dummy;
      for(int i=0;i<=n;i++)
      {
        fast=fast.next;
      }
      while(fast!=null)
      {
        fast=fast.next;
        slow=slow.next;
      }
      slow.next = slow.next.next;
      return dummy.next;
    }
}
