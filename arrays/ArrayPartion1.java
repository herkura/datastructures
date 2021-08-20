//Given an integer array nums of 2n integers,
//group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized.
//Return the maximized sum.
//for eg1 : nums = [1,5,4,2] 
//output : 5 , because Min(1,2) = 2 && Min(4,5) = 4 , so sum = 1+4=5
class Solution
{
  public int arrayPartition(int[] nums)
  {
    Arrays.sort(nums);
    int max=0;
    for(int i=0;i<nums.length;i+=2)
    {
      max+=nums[i];
    }
    return max;
  }
}































