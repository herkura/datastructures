//find the contiguous subarray (containing at least one number) which has the largest sum and return its sum
//For eg: [5,4,-1,7,8] , output = 23
//Time Complexity: O(n) , space: O(1)
class Solution
{
  public int maxSubArray(int[] nums)
  {
    int maxSum = Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<nums.length;i++)
    {
      sum+=nums[i];
      if(sum>maxSum)
      {
        maxSum = sum; 
      }
      if(sum<=0)
      {
        sum = 0; 
      }
    }
    return maxSum;
  }
}
