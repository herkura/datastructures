//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
//for eg1:  matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//output: true
// This can be solved using 2 methods 1) using 2 pointers , time complexity: O(n^2)
//                                    2) Using Binary Search which the most optimal approach
class Solution
{
  public boolean searchin2dmatrix(int[][] matrix, int target)
  {
     if(matrix.length == 0)
     {
       return false;
     }
    int m = matrix.length;
    int n = matrix[0].length;
    int left=0;
    int right = (m*n)-1;
    while(left<=right)
    {
      int mid = (left+(right-left)/2);
      int mid_point = matrix[mid/n][mid%n];
      if(mid_point==target)
      {
        return true;
      }
      if(target<mid_point)
      {
        right = mid-1;
      }
      else
      {
       left = mid+1;
      }
        
    }
    return false;
  }
}
//Time: o(mlogn)
