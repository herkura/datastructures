//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

//You may assume the integer does not contain any leading zero, except the number 0 itself.
//Example 1:
//Input: [1,2,3]
//Output: [1,2,4]
//Time : O(n)
class Solution
{
  public int[] plusOne(int[] nums)
  {
    for(int i=nums.length-1;i>=0;i--)
    {
      if(nums[i]<9)
      {
        nums[i]+=1;
        return nums;
      }
      nums[i]=0;
    }
    int[] num = new int[nums.length+1];
    num[0]=1;
    return num;
  }
}
