//static memory allocation.//
//using arrays.//
// time complexity : o(N) | space complexity: o(N).//
class Stack
{
    int top;
    Stack()
    {
        top=-1;
    }
    int max = 1000;//max size of the stack array.//
    int stack[] = new int[max];
    boolean isEmpty()
    {
        //stack under flow.//
        return (top<0);
    }
    
// function will add and check if elements is oushed or not.//
 boolean push(int x)
 {
        if(top>=(max-1)) 
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
       {
        stack[top++] = x;
        System.out.println(x);
        return true;
       } 
    }

       //poping the stack.//
       // this will check if the number is popped from the stack or not.//
      boolean pop()
      {
           if(top<0)
           {
            System.out.println("Stack Underflow");
            return false;
           }
           else
           {
               int s = stack[top--];
               System.out.println(s);
               return true;
           }
       }
       int peek()
       {
           if(top<0)
           {
               System.out.println("Stack Underflow");
           }
           else
           {
              int y =  stack[top];}
              return y;
           
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
        System.out.println(s.peek());
        s.pop();
    
     

    }
}
