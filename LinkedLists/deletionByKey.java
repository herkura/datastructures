import java.util.*;
class LinkedList
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data = d;
    }
  }
  //First we will insert some elements into linkedList
  public static LinkedList(LinkedList list, int data)
  {
    Node newNode = new Node(data);
    if(list.head == null)
    {
      list.head = newNode;
    }
    else
    {
      Node last = list.head;
      while(last != null)
      {
        last = last.next;
      }
      last.next = newNode;
    }
    return list;
  }
  //deleting on the basis of a key value.
  public static LinkedList(LinkedList list, int key)
  {
    //Condition 1:
    // when the head is the key value then update the head value
    Node currNode = list.head;
    Node prevNode = null;
    if(currNode!=null && currNode.data == key)
    {
      //updating the value of head
      list.head = currNode.next;
      return list;
    }
    //Condition 2:
    //
    
  }
  
}
