//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//If there are two middle nodes, return the second middle node.
//For eg: [1,2,3,4,5]
//output: [3,4,5] , Node 3 from this list (Serialization: [3,4,5])
//The returned node has value 3.  (The serialization of this node is [3,4,5]).
//Basic approach i.e using 2 pointers approach as soon as the fast pointer reaches the end of list
//we have the slow pointer at the middle of the list. 
//Definition for the linked list node
/*
  public class ListNode
  {
     int val;
     ListNode next;
     ListNode(int val, ListNode next)
     {
       this.val = val;
       this.next = next;
     }
   }
*/
public class Solution
{
   public ListNode middleNode(ListNode head)
   {
     ListNode fast = head;
     ListNode slow = head;
     while(fast!=null && slow!=null && fast.next!=null)
     {
       fast = fast.next.next;
       slow = slow.next;
     }
     return slow;
   }
}
//Time Complexity : O(n), space : O(1)
