//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order
//for eg : nums1=[1,2,2,1]  nums2=[2,2]
//output: [2].
//using hashset we can find intersected element
class Solution
{
  public int[] intersection(int[] nums1, int[] nums2)
  {
    HashSet<Integer> set = new HashSet<>();
    for(int i:nums1)
    {
      set.add(i);
    }
   HashSet<Integer> intersect = new HashSet<>();
    for(int i:nums2)
    {
      if(set.contains(i))
      {
        intersect.add(i);
      }
    }
    int[] result = new int[intersect.size()];
    int idx=0;
    for(int i: intersect)
    {
      result[idx++] = i;
    }
    return result;
  }
}
//Time : O(n), space : O(n)
