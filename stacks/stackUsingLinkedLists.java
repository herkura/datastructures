import java.io.*;
import java.util.*; // not used here.
class Stack
{
  //creating Node and the data var.//
  private class Node
  {
    int data;
    Node link;
  }
  Node top;
  Stack()
  {
    this.top = null;
  }
  //push operation.//
  public boolean push(int x)
  {
    Node temp = new Node();
    if(temp==null)
    {
      System.out.println("Heap Overflow");
      return false;
    }
    temp.data = x;
    top.link = top; // creating the new link.//
    temp = top; //updating the top.//
  }
 public boolean isEmpty()
  {
    return top == null;
  }
  //peek operation.//
  public int peek()
  {
    if(!isEmpty())
    {
      return top.data;
    }
    else
    {
     System.out.print("Stack Underflow!");
     return -1;
    }
  }
  //pop operation.//
  public  boolean pop()
  {
    if(top == null)
    {
      System.out.println("Stack Underflow!");
      return false;
    }
   else
   {
     top = (top).link;
     return true;
   }
  }
  //print the stack
  // printing the stack/////////
    public void print()
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
           
        }
        Node temp = top;
        while(top!=null)
        {
            System.out.printf("%d->",temp.data);
            temp = temp.link; //updating the link.//
        }
    }


}

class Solution
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        s.peek();
        s.pop();
        s.pop();
    }
}
  
    

