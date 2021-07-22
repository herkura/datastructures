//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//eg1 : s="ab##" ,t = "c#d#"
//output: true 
//in the above examples ab## gives an empty string amd also
//c#d# gives an empty string hence the function returns a true value
//eg2 : s="a#c" ,t = "b"
//output : false
//s in this eg becomes : c and t is : b so the function returns a true value
//Using 2 pointers
class Solution
{
  public boolean backspaceCompare(String s, String t)
  {
    int i = s.length()-1;
    int j = t.length()-1;
    int skipS = 0;
    int skipT = 0;
    while(i>=0 || j>=0)
    {
      while(i>=0)
      {
        if(s.charAt(i)=='#')
        {
          skipS++;
          i--;
        }
        else if(skipS>0)
        {
          skipS--;
          i--;
        }
        else 
        {
          break;
        }
      }
       while(j>=0)
      {
        if(t.charAt(j)=='#')
        {
          skipT++;
          j--;
        }
        else if(skipT>0)
        {
          skipT--;
          j--;
        }
        else 
        {
          break;
        }
      }
      if(i>=0 && j>=0 && s.charAt(i) != t.charAt(j))
      {
        return false;
      }
      if((i>=0) != (j>=0))
      {
        return false;
      }
      i--;
      j--;
    }
    return true; 
   }
}
//Time : O(M+N)
//Space : O(M+N)
