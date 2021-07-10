//Given two strings s and t, determine if they are isomorphic.

//Two strings s and t are isomorphic if the characters in s can be replaced to get t.

//All occurrences of a character must be replaced with another character while preserving the order of characters.
//No two characters may map to the same character, but a character may map to itself.
//eg1: s = "pop",  t = "top"
//output = false 
//eg2: s= "add" , t="egg"
//output = true;
//we will use a HashMap for this
//Explanation for eg1 : 
// s(input string)  | t(input string)
// key              |      value
// p                |       t
// o                |       o
// p                |       p
//first condition is that length 2 strings should be same.
// we check if the map has the key value then we 
// check if the key and the value is same or not
//there will be a condition when the key for 2 values will be same
//then in that we will check the values in the map
//if these values are already present then the strings are not ISOMORPHIC
//else we add the value corresponding to the key
//Time : O(n) space : O(1)
class Solution
{
  public boolean isIsomorphic(String s, String t)
  {
    if(s.length()!=t.length())
    {
      return false;
    }
    HashMap<Character, Character> map = new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);
      if(map.containsKey(c1))
      {
        if(map.get(c1)!=c2)
        {
          return false;
        }
      }
      else
      {
        if(map.containsValue(c2))
        {
          return false;
        }
        map.put(c1,c2);
      }
    }
    
    return true;
  }
}
