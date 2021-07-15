//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//eg1: s="aabccccdd"
//output:8
class Solution
{
  public int LongestPalindrome(String s)
  {
    int[] charCounts = new int[128];
    for(char c:s,toCharArray())
    {
      charCounts[c]++;
    }
     int result=0;
    for(int c:charCounts)
    {
      result+=c/2*2; // this will add the maximum number of chars which can form a palindrome
      if(result%2==0 && c%2==1)
      {
        result++;
      }
    }
    return result;
  }
}
//time: O(N+M)
