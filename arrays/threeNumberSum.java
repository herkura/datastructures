//Given an array, return a triplet of integers that add up to give a 0 and the triplets in the list shiuld not be duplicates
//eg : [-1,2,-1,0,1,-1,5,5,-10,7,8,5,3]
//output : [[-1,2,-1],[0,1,-1],[5,5,-10]]
class Solution
{
  public List<List<Integer>> threeSum(int[] nums)
  {
    List<List<Integer>> triplet = new ArrayList<>();
    for(int i=0;i<nums.length-2;i++)
    {
      int left=i+1;
      int right=nums.length()-1;
      while(left<right)
      {
        int sum = nums[i] + nums[left] + nums[right];
        if(sum == 0)
        {
          triplet.add(Arrays.asList(nums[i],nums[left],nums[right]));
          while(left<right && nums[left]==nums[left+1])left++;
          while(left<right && nums[right]==nums[right-1])right--;
          left++;
          right--;
        }
        else if(sum<0)
        {
          left++; 
        }
        else
        {
          right--;
        }
      }
      while(i<nums.length-2 && nums[i] == nums[i+1])i++;
    }
    return triplet; 
  }
}
//Time comlexity: O(N^2LOGN) but asymptomatically : O(N^2)
