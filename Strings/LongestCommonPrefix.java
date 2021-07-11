//A function to find the longest common prefix string amongst an array of strings.

//If there is no common prefix, return an empty string "".

//The best approach is to traverse through the array of strings and 
//we create the first index as the prefix
//compare that prefix with the other strings and the characters that
//donot match are removed.
//For eg : strs= ["flower","flow","flight"]
//output:  "fl"
class Solution
{
  public String longestPrefix(String[] strs)
  {
    if(strs.length==0)return "";
    String prefix = strs[0];
    for(int i=1;i<strs.length;i++)
    {
      while(strs[i].indexOf(prefix)!=0)
      {
        prefix = prefix.substring(0,prefix.length()-1);//reducing the length of the common prefix
      }
    }
    return prefix;
  }
}
//Time : O(S), where s is the sum of all the characters of the strs
//space: O(1)
