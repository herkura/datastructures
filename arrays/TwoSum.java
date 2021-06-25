//Given an array of integers  and an integer target, return indices of the two numbers such that they add up to that target value.
//For eg: [3,2,4] , target = 6 => output will be [1,2] i.e 2 + 4 = 6 
//This can be solved in 2 ways :
//1) using 2 pointers
//Soltion 1 Time complexity: O(n^2) 
class Solution
{
  public int[] TwoSum(int[] nums, int target)
  {
    for(int i=0;i<nums.length;i++)
    {
      int left = nums[i];
      for(int j=i+1;j<nums.length;j++)
      {
        int right = nums[j];
        if((left+right) == target)
        {
          return new int[]{i,j};
        }
          
      }
    }
      return new int[0];
  }
}
//------------*-------------*-----------
//Solution 2
//Using HashMap. Basic logic if the difference of the number 
//in the array and the target value is present in the map 
//then return the indices of the current number and the number that is the difference of the target and current number.
//Time Complexity: O(n)
class Solution
{
  public int[] TwoSum(int[] nums, int target)
  {
    int[] res = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
      if(map.containsKey(target - nums[i]))
      {
        res[0] = map.get(target - nums[i]);
        res[1] = i;
      }
      map.put(nums[i],i);
    }
    return res;
   }
}
