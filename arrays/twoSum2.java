//Given an array of integers  and an integer target, return indices of the two numbers such that they add up to that target value.
//we have to return the index in the form of 1-indexed format.
//For eg: [3,2,4] , target = 6 => output will be [1,2] i.e 2 + 4 = 6 
//This can be solved in 2 ways :
//1) using 2 pointers
//Solution 1 Time complexity: O(n^2) 
Class Solution
{
 public int[] twoSum(int[] nums, int target)
 {
   for(int i=0;i<nums.length;i++)
   {
     int left = nums[i];
     for(int j=i+1;j<nums.length;j++)
     {
       int right = nums[j];
       if((left+right) == target)
       {
         return new int[]{i+1,j+1};
       }
     }
   }
   return new int[0];
 }
}
//Solution 2:
//Time comlexity: O(n) 
Class Solution
{
 public int[] twoSum(int[] nums, int target)
 {
   int[] res = new int[2];
   HashMap<Integer,Integer> map = new HashMap<>();
   for(int i=0;i<nums.length;i++)
   {
      if(map.containsKey(target - nums[i]))
      {
        nums[0]=map.get(target - nums[i]);
        nums[1] = i+1;
      }
      map.put(nums[i],i+1);
   }
   return res;
   
 }
}
