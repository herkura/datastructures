import java.util.*;
import java.util.Stack;
class Solution
{
  //creating a method for precedence.//
  static int prec(char c)
  {
    switch(c)
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
  //converting Infix to prefix.
  //First step is to reverse the string.
  public static String InfixToPre(String s)
  {
    //reverse the string s using stack.
    String rev ="";
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<s.length();i++)
    {
      stack.push(s.charAt(i));
    }
    while(!(stack.isEmpty()))
    {
      rev+=stack.pop();
    }
    //convertion from reversed infix expression to prefix.
    String res="";
    Stack<Character> pre = new Stack<>();
    for(int j=0;i<rev.length();j++)
    {
      char ch = rev.charAt(j);
      if(ch == ')')
      {
        pre.push(ch);
      }
      else if(ch == '(')
      {
        while(!(pre.isEmpty()) && pre.peek() != ')')
        {
          res+=pre.pop();
        }
        pre.pop();
      }
      else
      {
        //checking the precedence.
        while(!(pre.isEmpty()) && prec(c) < prec(pre.peek())
              {
                res+=pre.pop();
              }
              pre.push(c);
       }
              
    }
        while(!(pre.isEmpty()))
              {
                if(pre.peek == ')')
                {
                  System.out.print("Invalid");
                }
                res+=pre.pop();
              }
          //reversing the converted string
            String converted = "";
              for(int k=0;k<res.length();k++)
              {
                 stack.push(res.charAt(k)); 
              }
              while(!(stack.isEmpty()))
              {
                converted+=stack.pop();
              }
              return converted;
  }
  
  public static void main(String[] args)
  {
    Scanner inp = new Scanner(System.in);
    String s = inp.next();
    System.out.print(InfixToPre(s));
  }
}
  
