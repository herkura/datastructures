//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//eg1: num1 = " 11"
//     num2 = "123" 
//output : "134"
//The approach to solve this problem will be same as that in adding binary
//the only difference is that in this the input is in decimal NOT binary
class Solution
{
  public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
      int i = num1.length()-1;
      int j = num2.length()-1;
      int carry=0;
      while(i>=0 || j>=0)
      {
        int sum = carry;
          if(i>=0)
          {
            sum+=num1.charAt(i--) - '0';
          }
        if(j>=0)
        {
          sum+=num2.charAt(j--) - '0';
        }
        
      sb.append(sum%10);
        carry = sum/10;
      }
      if(carry!=0)
      {
        sb.append(carry);
      }
      return sb.reverse().toString();
    }
}
