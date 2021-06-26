//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
//For eg: [1,2,3,1] => output : true
class Solution
{
  public boolean containsDuplicate(int[] nums)
  {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
      if(map.containskey(nums[i]))
      {
        return true;
      }
      map.put(nums[i],i);
    }
    return false;
  }
}
//Time Complexity: O(n) , Space = O(n)
