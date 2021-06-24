 //A function that returns the index if the target is found. If not, return the index where it would be if it were inserted in order.
 //For eg: [1,3,5,7]  target = 5 ,output = 2
//Time Complexity : O(nlogn)
 Class Solution
 {
   public int SearchInsertPos(int[] nums, int target)
   {
     Arrays.sort(nums);
     if(nums.length == 0)
     {
      return 0;
     }
     //if target is greater than the last element.
     //return the length of array
     if(target > nums[nums.length-1])
     {
       return nums.length;
     }
     //Finding the current position.
     for(int i=0;i<nums.length;i++)
     {
       if(nums[i]>=target)
       {
          return i;
       }
     }
     return 0;
   }
 }
