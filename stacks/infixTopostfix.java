import java.util.*;
import java.util.Stack;
class Solution
{
  //this function will return the precedence of the operator.//
  static int prec(char ch)
  {
    switch(ch)
    {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }
  //converting infix to postfix.
  public static String infixTopostfix(String str)
  {
    String res = "";
    Stack<Character> stack = new Stack<>();
    //iterate through the string
    for(int i=0;i<str.length;i++)
    {
      char c = str.charAt(i);
      // If the scanned character is an operand, add it to res.
      if(Character.isLetterOrDigit(c))
      {
        res+=c;
      }
       // else if the scanned character is an '(' push it to the stack.
      else if(c == '(')
      {
        stack.push(c);
      }
       //If the scanned character is an ')' pop and output from the stack  until an '(' is encountered.
      
      else if(c == ')')
      {
          while(!(stack.isEmpty()) && stack.peek()!='(')
        {
             res+=stack.pop();
        }
        stack.pop();
      }
      //when an operator is encountered
      else
      { 
         while(!(stack.isEmpty()) && prec(c) < prec(stack.peek()))
         {
             res+=stack.pop();
         }
        stack.push(c);
      }
     }
    while(!(stack.isEmpty()))
    {
       if(stack.peek() == '(')
       {
         System.out.print("Invalid");
       }
      res+=stack.pop();
    }
    return res;
  }
    
  public static void main(String[] args)
  {
    //taking the user input and pushing it into the stack.
    Scanner inp = new Scanner(System.in);
    String s = inp.nextLine;
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<s.length();i++)
    {
      String val = inp.nextLine();
      stack.push(val);
    }
    System.out.print(infixTopostfix(s));
  }
}
