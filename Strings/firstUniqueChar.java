//A function which returns the first non repeating character's index value in a string.
//For eg: herkurakurkura => for this case the non repeating characters are 'h' and 'e'
//so the output will be 0, since we have to return the index of FIRST non repeating characters.
class Solution
{
  public int firstUniqueChar(String s)
  {
    //finding the duplicate character
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      if(!map.containsKey(s.charAt(i)))
      {
        map.put(s.charAt(i),i);
      }
      else
      {
        map.put(s.charAt(i),-1);
      }
    }
    int min = Integer.MAX_VALUE;
    for(char c:map.keySet())
    {
      if(map.get(c)>-1 && map.get(c)<min)
      {
        min = map.get(c);
      }
    }
    return min == Integer.MAX_VALUE ? -1 : min;
  }
}
