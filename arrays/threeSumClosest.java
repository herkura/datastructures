//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//Return the sum of the three integers.
//eg 1 : nums = [-1,2,1,-4], target = 1
//output : 2 (The sum closest to 1 is (-1 + 2 + 1 = 2))
class Solution
{
  public int threeSumClosest(int[] nums, int target)
  {
    Arrays.sort(nums);
    int diff = Integer.MAX_VALUE;
    for(int i=0;i<nums.length-2;i++)
    {
      int left = i+1;
      int right = nums.length-1;
      while(left<right)
      {
        int curr_sum = nums[i] + nums[left] + nums[right];
        if(Math.abs(target - curr_sum)<Math.abs(diff))
        {
          diff = target - curr_sum;
        }
        if(curr_sum<target)
        {
          left++;
        }
        else
        {
          right--;
        }
      }
    }
    return target - diff;
  }
}
