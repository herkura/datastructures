//This is an a sorting algorithm which is solved using brute force approach
//Time complexity : O(n^2) | Space : O(1)
class Solution
{
  public static int[] bubbleSort(int[] nums)
  {
    if(nums.length == 0)
    {
      return new int[]{};
    }
    int n = nums.length;
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
        if(nums[j]>nums[j+1])
        {
          int temp = nums[j];
          nums[j]=nums[j+1];
          nums[j+1]=temp;
        }
      }
    }
    return nums;
  }
}
