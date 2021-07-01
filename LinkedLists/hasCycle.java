//A function that tells whether a linked list has a cycle or not.
//for eg1: [3,2,0,-4], pos = 1 
//output:true
//eg2: [1], pos=-1
//output=false
//Solution 1: usind hash set, Time complexity:O(n), space complexity:O(n)
//Definition of data structure usedL:
/*class ListNode {
       int val;
       ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }*/
public class Solution
{
  public boolean hasCycles(ListNode head)
  {
    HashSet<ListNode> set = new HashSet<>();
    while(head!=null)
    {
      if(set.contains(head))
      {
        return true;
      }
      set.add(head);
      head = head.next;
    }
    return false;         
  }
}
//Solution 2: Using 2 pointers
//time : O(n) , space: O(1)
/*class ListNode {
       int val;
       ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }*/
class Solution
{
  public boolean hasCycles(ListNode head)
  {
     if(head==null)
       return false;
    ListNode fast = head.next;
    ListNode slow = head;
    while(fast!=null && fast.next!=null && slow!=null)
    {
      if(fast==slow)
      {
        return true;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    return false;
  }
}
