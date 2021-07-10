//Given 2 strings s and t , we have to check whether the strings are anagrams or not
//for eg : s= "anagram" t="nagaram"
//output:  true
// Anagrams is basically a re arrangment of the characters of the string in a random order
//but the characters should be the same
//Logic: we will create an array that keeps the track of the unique chars in the string.
//to find that we will subtract the ASCII value of every character in the sring with 'a'.
//if we get the frequency != 0 then this means that there is a unique char in the string
class Solution
{
   public boolean isAnagram(String s, String t)
   {
      if(s.length()!=t.length())
      {
        return false;
      }
     int[] frequency = new int[26]; //26 alphabets
     for(int i=0;i<s.length();i++)
     {
       frequency[s.charAt(i) - 'a']++;
       frequency[t.charAt(i) - 'a']--;
     }
     for(int i:frequency)
     {
       if(i!=0)
         return false;
     }
     return true;
    }
}
//Time: O(n), space: O(1)
