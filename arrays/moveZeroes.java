//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//for eg : [0,1,3,12,0,0]
//output : [1,3,12,0,0,0]
//Time: O(n)
class Solution
{
  public void moveZeroes(int[] nums)
  {
    int idx=0;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]!=0)
      {
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
        idx++;
      }
    }
  }
}
