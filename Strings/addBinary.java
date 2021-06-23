//A function that returns the sum of 2 strings as a binary strings.
//For eg:  a = "1010"
         //b = "1011"
// so we have to create a logic that gives the output for this case "10101".
class Solution
{
  public String addBinary(String a, String b)
  {
    StringBuilder sb = new StringBuilder();
    int i = a.length()-1;
    int j = b.length()-1;
    int carry = 0;
    //iterate backwards.
    while(i>=0 || j>=0)
    {
      int sum = carry;
      if(i>=0)
      {
        sum+=a.charAt(i--) - '0'; //converting the char to int
      }
      if(j>=0)
      {
        sum+=b.charAt(j--) - '0';
      }
      
      sb.append(sum%2);
      carry = sum/2;
    }
    if(carry!=0)
    {
      sb.append(carry);
    }
    // we have to reverse the output
    return sb.reverse().toString();
  }
}

