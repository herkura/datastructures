//Given a linked list which is sorted and has duplicate values.
//we need to  romove those values such that duplicate number appears only once.
//for eg:[1,1,2,3,3]
//output = [1,2,3]
//Definition for the linked list
/*
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
*/
class Solution
{
  public ListNode deleteDup(ListNode head)
  {
    ListNode curr = head;
    while(curr!=null)
    {
      if(curr.next == null)break;
      else if(curr.val == curr.next.val)
      {
        curr.next = curr.next.next;
      }
      else
      {
        curr = curr.next;
      }
    }
   return head; 
 }
}
//Time: O(n) , space : O(1)
