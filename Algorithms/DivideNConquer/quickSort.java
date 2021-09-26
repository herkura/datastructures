// This sorting algorithm is based on the priciple of Divide and conquer approach.
// there are 3 main steps to remember while performing quick sort algorithm
// 1) if left > pivot and right < pivot, swap the right pointer with the left one
// 2) if left <= pivot, left++. if right>=pivot then right--.
// 3) if the above 2 conditions are not there then  just swap the right pointer with the pivot.
// Best Time complexity : O(nlogn) ,Best space : O(logn). 
class solution
{
  public static int[] quicksort(int[] nums)
  {
    helper(nums,0,nums.length-1);
    return nums;
  }
  public static void helper(int[] nums, int start, int end)
  {
    int pivot = start;
    int left = start+1;
    int right = nums.length-1;
    while(left<=right)
    {
      if(nums[left]>nums[pivot] && nums[right] < nums[pivot])
      {
        swap(left,right,nums);
      }
      if(nums[left]<= nums[pivot])
      {
        left+=1;
      }
      if(nums[right] >= nums[pivot])
      {
       right-=1;
      }
    }
    
    swap(pivot,right,nums);
    //now we will check whether the left sub array is smaller than the right sub array or not.
    //                        left subtree length < right subtree length
    boolean isLeftSideSmaller = (right-1) - start < end - (right+1);
    if(isLeftSideSmaller) // if left subtree is smaller then we first sort the left then right 
    {
       helper(nums,start,right-1);
       helper(nums,right+1,end);
    }
    else // else we first sort the right sub tree then the left sub tree 
    {
        helper(nums,right+1,end);
        helper(nums,start,right-1);
    }
  }
  public static void swap(int i, int j, int[] nums)
  {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
  }
}
