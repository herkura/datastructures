//You are given a sorted unique integer array nums.
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//Each range [a,b] in the list should be output as:
//Conditions:
// 1) "a->b" if a != b
// 2) "a" if a == b
//Logic for number to be in a range, the difference between 2 consecutive numbers should be 1 
//only then they form a range
//for eg 1: [1,2,3,5,6,7,9,10,12]
//output: [1,2,3] -----> "1"->"3"
//        [5,6,7] -----> "5"->"7"
//        [9,10]  -----> "9"->"10"
//        [12]    -----> "12"
// eg 2: []
//output: []
//eg 3: [10] 
//output : "10"
class Solution
{
  public List<String> summaryRanges(int[] nums)
  {
    List<String> list = new ArrayList<>();
    if(nums.length==0)
    {
      return list;
    }
    for(int i=0;i<nums.length;i++)
    {
       int curr = nums[i];
      //while next index is in nums and the difference is 1 keep iterating.
      while(i+1<nums.length && nums[i+1] - nums[i] == 1)
      i++;
      {
        if(curr!=nums[i])
        { 
           list.add(curr + "->" + nums[i]);
        }
        else
        {
          list.add(nums[i] + "");
        }
      }
    }
    return list;
  }
}
