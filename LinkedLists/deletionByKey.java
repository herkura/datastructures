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
  public static LinkedList add(LinkedList list, int data)
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
  public static LinkedList delete(LinkedList list, int key)
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
    //if the key to be deleted is not same as that of the node val.
    //in this case just traverse through the list and find the key.
    //keep a track of the prev node by updating its value to the current node.
    while(currNode != null && currNode.data !=key)
    {
      prev = currNode;
      currNode = currNode.next;
    }
    if(currNode != null)
    {
      //Just skip that node which is to be deleted.
      prev.next = currNode.next;
    }
    if(currNode == null)
    {
      System.out.println(key + " not found");
    }
    return list;
    
  }
  public static void print(LinkedList list)
  {
    Node currNode = list.head;
    while(currNode != null)
    {
      System.out.print(currNode.data);
    }
    currNode = currNode.next;
  }
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    list = add(1,list);
    list = add(3,list);
    list = add(5,list);
    list = add(7,list);
    delete(list,3);
    print(list);
    
  }
}

