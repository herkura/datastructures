//Given 2 linked lists l1 and l2. We have to merge the linklissuch that the elements are arranged in increasing order.
//for eg: l1 = [1,2,3] l2 = [1,3,4]
//output : [1,1,2,3,3,4]
//Definition for Singly linked list.// 
/*class ListNode
{
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
} */
class Solution
{
  public ListNode mergeList(ListNode l1 , ListNode l2)
  {
    //a temp Node that holds the value of head
    ListNode temp = new Node(0);
    ListNode head = temp;
    //iterate through the 2 lists
    while(l1!=null && l2!=null)
    {
      if(l1.val < l2.val)
      {
        temp.next = l1;
        l1 = l1.next;
      }
      else
      {
        temp.next = l2;
        l2 = l2.next;
      }
      temp = temp.next;
     }
    //when only l2 is null
    if(l1!=null)
    {
      temp.next = l1;
    }
    else
    {
      temp.next = l2;
    }
     return head.next;  
   }
}
//Time : O(n) space : O(1)
