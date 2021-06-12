//Sort the elements of the stack in DESCEDING order.
import java.util.*;
import java.util.Stack;
class Solution
{
  public static Stack<Integer> sort(Stack<Integer> stack)
  {
    //create a temp stack
    Stack<Integer> temp = new Stack<>();
    while(!(stack.isEmpty()))
    {
      int tmp = stack.pop()
      while(!(temp.isEmpty()) && temp.peek() > tmp)
      {
        //pop the element and then push it into the main stack.
        stack.push(temp.pop());
      }
      //push the tmp in temp stack
      temp.push(tmp);
    }
    return temp;
  }
  public static void main(String[] args)
  {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<n;i++)
    {
      int val = inp.nextInt();
      stack.push(val);
    }
    Stack<Integer> temp = sort(stack);
    while(!(temp.isEmpty()))
    {
      System.out.print(temp.pop() + " ");
    }
  }
}
