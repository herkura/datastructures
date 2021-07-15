//Given the head of a singly linked list, return true if it is a palindrome.
//for eg : [1,2,2,1]
//output: true
//using 2 pointers, fast and slow.
//as soon as the slow pointer reaches the middle of the list we reverse the 
//rest of the list and then compare the elements if val matches return true else false.
//definition for the node of linked list
 /* public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 */
class Solution
{
  public boolean isPalindromeList(ListNode head)
  {
    ListNode fast = head;
    ListNode slow = head;
    while(fast!=null && fast.next != null && slow!= null)
    {
      fast = fast.next.next;
      slow = slow.next;
    }
    //middle of the list reached
    slow = reverse(slow);
    fast = head;
    while(slow!=null)
    {
      if(slow.val != fast.val)
      {
        return false;
      }
     slow = slow.next;
     fast = fast.next;
    }
    return true;
  }
  private ListNode reverse(ListNode head)
  {
    ListNode prev = null;
    while(head!=null)
    {
      ListNode newNode = head.next;
      head.next = prev;
      prev = head;
      head = newNode;
    } 
    return prev;
  }
}
//Time: O(n)
