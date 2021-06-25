//Given an array(non-empty). we have to create a function that returns the element in the array which appears only once.
//For eg : [3,2,1,2,3] 
//output : 1 since 1 is not repeating itself
//solution 1:
//Time complexity : O(nlogn)
class Solution
{
  public int singleNumber(int[] nums)
  {
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i+=2)
    {
      if(nums[i]!=nums[i+1])
      {
        return nums[i];
      }
    }
    return nums[nums.length-1];
  }
}
//-----------*----------------*--------------------
//Solution 2:
//Time Complexity: O(n)
//Logic : Any number that XORs with 0 returns the number itself and same number when XORed
//return 0 , so if the number are repeating it will give 0 an if not it will return that element.
class Solution
{
  public int singleNumber(int[] nums)
  {
     int result=0;
     for(int i=0;i<nums.length;i++)
     {
       result = result ^ nums[i];
     }
    return result;
  }
}

