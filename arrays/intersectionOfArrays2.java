//Given two integer arrays nums1 and nums2.
//return an array of their intersection. 
//Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//For eg :nums1 = [1,6,12,7,1,8] nums2 = [1,6,6,11,9,12]
//output : [1,6,12]
class Solution
{
  public int[] intersection(int[] nums1, int[] nums2)
  {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> ls = new ArrayList<>();
    for(int i=0;i<nums1.length;i++)
    {
      map.put(nums1[i],map.getOrDefault(nums[i],0)+1);
    }
    for(int i=0;i<nums2.length;i++)
    {
      if(map.containsKey(nums2[i]) && (map.get(nums2[i])>0))
      {
        map.put(nums2[i],map.get(nums2[i])-1);
        ls.add(nums2[i]);
      }
    }
    int[] res = new int[ls.size()];
    for(int i=0;i<ls.size();I++)
    {
      res[i] = ls.get(i);
    }
    return res;
  }
}
//Time : O(M+N), where M is the length of nums1 and N is the length of nums2
//space : min(O(MN))
