//Given a string s , we have to find whether that string has a valid palindrome permutations
//meaning that the string should be a palindrome as well as it can be an anagram
//eg1: aab
//output : true
//eg2 : case
//output : false
class Solution
{
  public boolean IspalidromePermutation(String s)
  {
    int[] Charcounts = new int[128];
    for(int i=0;i<s.length();i++)
    {
       Charcounts[s.charAt(i)]++;
      //putting the index of the string for an array converts the chars to their ascii value
      
    }
    int counts=0;
    for(int i=0;i<Charcounts.length;i++)
    {
      counts+=Charcounts[i]%2;
    }

    return counts<=1;    
  }
}
//Time : O(n) space : O(1)
