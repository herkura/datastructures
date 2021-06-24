//Given 2 arrays nums1 and nums2, we have to merge the 2 arrays and sort it in non decreasing order.
//given : nums1.length = m + n and nums2.length = n
//For eg: nums1 = [1,2,3,0,0,0] , nums2 = [2,5,6]
//so the output will be : [1,2,2,3,5,6] in sorted order.
//Time complexity : O(n), Space : O(1)
//nums2 length = nums1 length + num2 length
class Solution
{
  public int[] mergeSortedArr(int[] nums1, int m, int nums2, int n)
  {
    for(int i=0;i<n;i++)
    {
      nums1[m+i] = nums2[i];
    }
    Arrays.sort(nums1);
  }
}
