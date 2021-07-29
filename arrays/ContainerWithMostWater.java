//we are given an array of non negative numbers
// we have to find the max area of the container that is with most water 
//for eg: [1,8,6,2,5,4,8,3,7]
//output: 49
//This can be done using 2 pointers and brute force
// 2 pointer better time complexity than brute force
//using 2 pointer
class Solution
{
  public int maxArea(int[] height)
  {
    int maxArea=0;
    int i=0;
    int j=height.length-1;
    while(i<j)
    {
      int min=Math.min(height[i],height[j]);
      maxArea = Math.max(maxArea,min*(j-i));
      if(height[i]<height[j])
      {
        i++;
      }
      else
      {
        j--;
      }
    }
    return maxArea;
   
  }
}
//Time : O(n) , space : O(1)
