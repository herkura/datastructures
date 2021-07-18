//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//eg1 : s = "aba"
// output = true
//eg 2 : s = "abca"
//output : true (because if we remove b we have aca which is a palindrome and if we 
//remove c we have aba which is also a palindrome
class Solution
{
  public boolean validPalindrome(String s)
  {
    int i = 0;
    int j = s.length()-1;
    while(i<j)
    {
      if(s.charAt(i)!=s.charAt(j))
      {
        return isPalindrome(s,i+1,j) || return isPalindrome(s,i,j-1);
      }
      i++;
      j--;
    }
    return true;
  }
  public boolean isPalindrome(String s,int left, int right)
  {
    while(left<right)
    {
      if(s.charAt(left++)!=s.charAt(right--))
      {
        return false;
      }
    }
    return true;
  }
}
