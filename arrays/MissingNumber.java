//Given an array nums containing n distinct numbers in the range [0, n]
//return the only number in the range that is missing from the array.
//For eg: [9,6,4,2,3,5,7,0,1] , Output : 8
//Sol 1:
//using a hashset
class Solution
{
  public int MissingNumber(int[] nums)
  {
    HashSet<Integer> set = new HashSet<>();
    for(int i:nums)
    {
      set.add(i);
    }
    for(int i=0;i<=nums.length;i++)
    {
      if(set.contains(i))
      {
        return i;
      }
    }
    return -1;
  }
}
//Time : O(n) , space : O(n)
//--------*-----------*--------
//Sol 2: by finding the sum till nth number and then subtracting the sum of all number in nums
// from sum(nth)
class Solution
{
  public int missingNumber(int[] nums)
  {
    int sum=0;
    for(int i:nums)
    {
      sum+=nums[i];
    }
    int n = nums.length+1;//include nth element also
    int missing = (n*(n-1)/2) - sum;
    return missing;
  }
}
//Time : 0(n) space : O(1)
