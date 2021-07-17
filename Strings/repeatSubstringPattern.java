//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//For eg1:  s = "abab"
//output : true
//My approach : iterate till half length of the string
// if the length of the string leaves a remainder 0 when divided by the index value
// then we find the count fo the chars
//we create a substring and append it to a StringBuilder
//we compare the elements if the StringBuilder and string s
//if they match return true
class Solution
{
  public boolean repeatedSubstringPattern(String s)
  {
    int len = s.length();
    for(int i=len/2;i>=1;i--)
    {
      if(len%i==0)
      {
        int count = len / i;
        String sub = s.substring(0,i);
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<count;j++)
        {
          sb.append(sub);
        }
        if(sb.toString().equals(s))
        {
          return true;
        }
      }
    }
    return false;
  }
}
//Time  :O(N^2)
