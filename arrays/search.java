//There is an integer array nums sorted in ascending order (with distinct values).

//Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
//such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
//For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

//Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// for eg1: nums = [4,5,6,7,0,1,2], target = 0
 // Output: 4
//Time : O(logn)
class Solution
{
  public int search(int[] nums, int target)
  {
    if(nums == null || nums.length==0)
    {
      return -1;
    }
    int left = 0;
    int right = nums.length-1;
    while(left<right)
    {
      int mid = left + (right - left)/2;
      if(nums[mid]>nums[right])
      {
        left = mid+1;
      }
      else
      {
        right = mid;
      }
    }
    
    int start = left;
    left = 0;
    right = nums.length-1;
    //checking perfect boundary conditions
    if(target >= nums[start] && target<= nums[right])
    {
      left = start;
    }
    else
    {
      right = start;
    }
    
    //performing Binary search
    while(left<=right)
    {
      int mid = left + (right - left)/2;
      if(nums[mid] == target)
      {
        return mid;
      }
      else if(nums[mid] < target)
      {
        left = mid+1;
      }
      else
      {
        right = mid-1;
      } 
    }
   return -1;   
  }
}
