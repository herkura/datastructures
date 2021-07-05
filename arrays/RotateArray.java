//Given an array nums. we have to rotate the array till kth position where k is non negative
//For eg : nums=[1,2,3,4,5,6,7] k = 3
//output: [5,6,7,1,2,3,4]
//approach is to reverse the whole array first so we get [7,6,5,4,3,2,1]
//then we reverse till the k-1th location so that we get [5,6,7,4,3,2,1]
//at last we just have to rotate from kth posotion till the last number: so we get [5,6,7,1,2,3,4]
class Solution
{
  public void rotateArray(int[] nums, int k)
  {
    k%=nums.length; //This handles the condition when length is less than k
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
  }
  public void reverse(int[] nums, int start, int end)
  {
    while(start<end)
    {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
    
  }
  
}
//Time : O(n) , space : O(1)
