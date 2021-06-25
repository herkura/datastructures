//given a non empty array. we have to return the majority element in that array
//For eg : [1,2,2,1,1,1,2,2,2]
//output will be 2.
//given: The majority element is the element that appears more than ⌊n / 2⌋ times
//Solution 1:
//Time complexity: O(logn)
class Solution
{
  public int majorityElement(int[] nums)
  {
    Arrays.sort(nums);
    return nums[nums.length/2];
  }
}
//Solution 2:
//time comlexity : O(n)
//Using moore's voting algorithm//
//Explanation:
//[2,2,1,1,1,2] , according to the algorithm we create consider the first element to be in majority.
//and we create a counter which keeps the track of that element.So in this case 2 is in majority when we start iterating
//counter keeps incrementing by 1. Now when we the index is at 1 then the counter decrements by 1.
// as soon as the counter reaches to a value of 0 it resets the majority element to the current element
//which in this test case is 1. then we continue to iterate and at the end index is again at 2 so the counter resets to 0 and we have the majority element as 2
// which the is final output.
class Solution
{
  public int majorityElement(int[] nums)
  {
    int current = nums[0];
    int count=1;
    for(int i=1;i<nums.length;i++)
    {
      if(count == 0)
      {
        current = nums[i];
      }
      if(nums[i] == current)
      {
        count+=1;
      }
      else
      {
        count-=1;
      }
    }
    return current;
  }
}
