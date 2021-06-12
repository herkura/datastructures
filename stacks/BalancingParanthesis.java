import java.util.*;
import java.util.Stack;
class Solution
{
  public static boolean isValid(String s)
  {
    Stack<Character> stack = new Stack<>();
     //iterate thru every char of the string.
    for(char ch : s.toCharArray())
    {
      //if there is a starting paranthesis then push the closing paranthesis into the stack.
       if(ch == '(')
       {
          stack.push(')');
       }
      else if(ch == '{')
      { 
        stack.push('}');
      }
      else if('[')
      {
         stack.push(']');
      }
      //if the stack is empty or any top element is not same as char them return false.
      else if(stack.isEmpty() || stack.pop() != ch)
      {
        return false;
      }
     }
    return stack.isEmpty();
  }
  
  public static void main(String[] args)
  {
    Scanner inp = new Scanner(System.in);
    String s = inp.nextLine();
    if(isValid(s))
    {
     System.out.println("Balanced");
    }
    else
    {
      System.out.print("Not Balanced");
    }
  }
}

