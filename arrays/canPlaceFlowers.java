//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n
//return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
//for eg1: [1,0,0,0,1] ,n=1
//output : true
class Solution
{
  public boolean canplaceFlower(int[] flowerbed, int n)
  {
    if(n==0)
    {
      return true;
    }
    int count=0;
    for(int i=0;i<flowerbed.length;i++)
    {
      if(flowerbed[i]==0)
      {
        if((i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0))
        {
          flowerbed[i]=1;
          count++;
        }
        if(count>=n)
        {
          return true;
        }
      }
    }
    return false;
  }
}
//Time: O(N) and space : O(1)
