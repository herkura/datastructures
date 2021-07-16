//Designing qeues using linked lists
class ListNode
{
  int val;
  ListNode next;
  ListNode(int val)
  {
    this.val = val;
    this.next = null;
  }
}
class Qeue
{
  ListNode head,tail;
  Qeue()
  {
    this.head = null;
    this.tail = null;
  }
  public boolean isEmpty()
  {
    return head == null;
  }
  public int peek(int val)
  {
    return head.val;
  }
  public void add(int val)//Enqeue
  {
    ListNode node = new ListNode(val);
    if(tail != null)
    {
      tail.next = node;
    }
    tail = node;
    if(head==null)
    {
      head = node;
    }
  }
  public void remove(ListNode head)//Deque
  {
     ListNode curr = head;
     while(curr!=null && curr.next!=null)
     {
       curr.val = curr.next.val;
       curr.next = curr.next.next;
     }
     
  }
}
public class Main
{
  public static void main(String[]  args)
  {
    Qeue q = new Qeue();
    q.add(20);
    q.add(40);
    q.remove();
    
  }
}
