// Time : O(1) - for inserting at head.
// Time : O(n) - for instering at tail.  
class LinkedList
{
  public class Node
  {
    Node next;
    int data;
    public Node(int data)
    {
      this.data = data; 
    }
  }
  private Node head;
  private int size;
 /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(index)
  {
    if(index>=size)return -1;
    Node curr = head;
    for(int i=0;i<index;i++)
    {
      curr = curr.next;
    }
    return curr.data;
  }
  //adding
  public void addAtHead(int data)
  {
    Node prev = head;
    head = new Node(data);
    head.next = prev;
    size++; 
  }
  public void addAtTail(int data)
  {
    Node curr = head;
    while(curr.next!=null)
    {
      curr = curr.next;
    }
    curr.next = new Node(data); 
    size++;
  }
  //add at any index
  public void addAtIndex(int index, int data)
  {
    if(index>=size)return;
    else if(index==0)
    {
      addAtHead(data);
    }
    else if(index==size)
    {
      addAtTail(data);
    }
    else
    {
      Node  curr = new Node(data);
      Node prev = head;
      for(int i=0;i<index-1;i++)
      {
        prev=  prev.next;
      }
      curr.next = prev.next;
      curr = prev.next;
      size++;
    }
  }
  //deletion
  public void deleteByIndex(int index)
  {
    if(index>=size)return;
    if(index==0)
    {
      head = head.next;
    }
    else
    {
      Node prev = head;
      for(int i=0;i<index-1;i++)
      {
        prev = prev.next;
      }
      prev.next = prev.next.next;
      size--;  
        }
  } 
}
class Solution
{
  public static void main(String[] args)
  {
   LinkedList obj = new LinkedList();
   int param_1 = obj.get(index);
   obj.addAtHead(val);
   obj.addAtTail(val);
   obj.addAtIndex(index,val);
   obj.deleteAtIndex(index);
 
  }
}
