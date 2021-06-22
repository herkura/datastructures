// Time : O(1) - for inserting at head.
// Time : O(n) - for instering at tail.  
import java.io.*;
class LinkedLists
{
  Node head;
  //creating a class for Node.
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data = d;
    }
  }
  //Function for adding the element.
  public static LinkedList add(LinkedList list, int data)
  {
    Node newNode = new Node(data);
    newNode = list.next;
    
    //head is null then replace it with the newNode.//
    if(list.head == null)
    {
      list.head = newNode;
    }
    //if not then traverse till the end and then add in the end.
    else
    {
      Node last = list.head;
      //if the next node is not null then keep on inserting.// 
      while(!last.next!=null)
      {
        last = last.next;
      }
      last.next = newNode;
    }
    return list;
  }
  //function to print the list.
  public static void print(LinkedList list)
  {
    Node currNode = list.head;
    while(currNode != null)
    {
      System.out.print(currNode.data);
      //then move to the next node.
      currNode = currNode.next;
    }  
  }
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    list = add(list,1);
    list = add(list,2);
    list = add(list,3);
    list = add(list,4);
    print(list);
  }
}
