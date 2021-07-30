//Given a string s.We have to find the length of the longest substring which has NON-REPEATING characters
//eg1: s = "abcabbbbbbbbbcccabbabababc"
//Use a hashset to keep track of the character. If character is not the same then add it into the set and increment the second pointer
//else just remove the character and increment the first pointer
class Solution
{
  public int lengthOfLongestSubstring(String s)
  {
    int i=0,j=0;
    HashSet<Character> set = new HashSet();
    int res=0;
    while(j<s.length())
    {
      if(set.contains(s.charAt(j)))
      {
        set.add(s.charAt(j));
        j++;
        res = Math.max(set.size(),res);
      }
      else
      {
        set.remove(s.charAt(i));
        i++;
      }
    }
    return res;
  }
}
//Time: O(N)
//Space: O(M) 
