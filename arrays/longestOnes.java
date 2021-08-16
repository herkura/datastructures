// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//for eg1: nums=[0,1,1,1,0,0,0,1,1,1] ,k=3
//output : 9
//we use sliding window approach
class Solution
{
  public int longestOnes(int[] nums, int k)
  {
    if(nums.length==0)
    {
      return 0;
    }
    int i=0,j=0;
    while(i<nums.length)
    {
      if(nums[i]==0)
      {
        k--;
      }
      // when k is negative
      if(k<0)
      {
        if(nums[j]==0)
        {
          k++;//bring k's value closer to 0
        }
        j++;
      }
      i++;
    }
    return i-j; //distance of the window
  }
}

//time : O(n)    
 
