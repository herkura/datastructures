//Given an integer array nums and an integer k  
//return true if there are two distinct indices i and j in the array such that 
// condition: nums[i] == nums[j] and abs(i - j) <= k.
//For eg: [1,2,3,1] ,k=3 => output: true. Since the condition stands true.
//Time compexity: O(n)
class Solution
{
  public boolean containsNearbyDuplicate(int[] nums.int k)
  {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
      int j=nums[i];
      //The condition
      if(map.containsKey(j) && i-map.get(j)<=k)
      {
        return true;
      }
      map.put(nums[i],i);
    }
    return false;
  }
}
