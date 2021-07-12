// Given a pattern and a string s, find if s has the same pattern.
//eg1 : patter= "abba" , s = "hello bye bye hello"
//output : true
//eg2 : patter = "abab" , s = "hello bye bye hello"
//output : false
//Time : O(n) 
class Solution
{
  public boolean wordPattern(String patter, String s)
  {
    String[] words = s.split(" ");
    if(words.length!=pattern.length())
    {
      return false;
    }
    HashMap<Character, String> map = new HashMap<>();
    for(int i=0;i<pattern.length();i++)
    {
      char p = pattern.charAt(i);
      if(map.containsKey(p))
      {
        if(!(map.get(p).equals(words[i]))
           {
             return false;
           }
       }
       else
      {
        if(map.containsValue(words[i])
           return false;
        map.put(p,words[i]);
      }
             
      }
           return true;
   }
}
