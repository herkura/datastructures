//Given the head of a linked list and an integer val,
//remove all the nodes of the linked list that has Node.val == val, and return the new head.
//For eg : [1,2,6,3,4,5,6] , val = 6
//output : [1,2,3,4,5]
//Definition for the function for node
/*public class ListNode
{
  int val;
  ListNode next;
  ListNode(int val)
  {
    this.val;
  }
  ListNode(int val, ListNode next)
  {
    this.val = val;
    this.next = next;
  }
  
}*/
public class Solution
{
   public ListNode removeElements(ListNode head, int val)
   {
     //when the element to be removed is at the head. 
     while(head!=null && head.val == val)
     {
       head = head.next;
     }
     ListNode currNode = head;
     while(currNode!=null && currNode.next!=null)
     {
       if(currNode.val == val)
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
/* Time: O(n) space: O(1)
