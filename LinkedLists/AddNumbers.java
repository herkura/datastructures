//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list.
//For eg1 :  l1 = [2,4,3], l2 = [5,6,4]
//output : [7,0,8]
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode temp = new ListNode(0);
      ListNode head = temp;
      int carry=0;
      while(l1!=null || l2!=null)
      {
        int v1=0,v2=0;
        if(l1!=null)
        {
          v1 = l1.val;
        }
        if(l2!=null)
        {
          v2 = l2.val;
        }
        int sum=carry+v1+v2;
        carry = sum/10;
        head.next = new ListNode(sum%10);
        head=head.next;
        if(l1!=null)l1=l1.next;
        if(l2!=null)l2=l2.next;
      }
      if(carry>0)
      {
        head.next = new ListNode(carry);
      }
      return temp.next;
    }
}
//Time: O(M|N)
