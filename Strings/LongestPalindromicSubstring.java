//Given a String s.Return the longest palindromic substring.
//eg1 : s = "babad"
//output : "bab"
//Brute force method
//Time : O(n^3)
class Solution
{
  public String longestPalindrome(String s) 
  {
    if(s.length()==0 || s==null)
    {
      return "";
    }
    String longestSubs = "";
    for(int i=0;i<s.length();i++)
    {
      for(int j=i+1;i<s.length();j++)
      {
         if(j-i>longestSubs.length() && isPalindrome(s.substring(i,j))) // j-i>longestSubs.length() this is a boundary condition for substring  in s 
         {
           longestSubs = s.substring(i,j); 
         }
      }
    }
    return longestSubs;
  }
  public boolean isPalindrome(String s)
  {
    int i=0;
    int j = s.length()-1;
    while(i<j)
    {
      if(s.charAt(i++)!=s.charAt(j--))
      {
        return false;
      }
    }
    return true;
  }
}

