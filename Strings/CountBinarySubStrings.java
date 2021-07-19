//Given a String s and it has 0's and 1's only
// we have to find the count of the min substrings that are grouped consecutively.
//0011 this is a grouped sub string 
//So we find the min count of 0's n 1's in the first window then update it
class Solution
{
  public int countBinarySubstrings(String s)
  {
    int count = 0, int prev = 0, int curr = 1; 
    for(int i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)!=s.charAt(i+1))
      {
        count+=Math.min(prev,curr);
        prev = curr;//update the window i.e moving to next window
        curr = 1; // refresh the value of curr for next window
      }
      else
      {
        curr++;
      }
    }
    return count+=Math.min(prev,curr);
  }
}
//time : O(N), space : O(1)
