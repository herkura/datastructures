// Given a matrix of m x n  two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
// we have to convert a 2-D array to 1-D array
///for eg1: mat[][] = [[1,2,3],[4,5,6]] ,  r=1,c=6
//ouput : [[1,2,3,4,5,6]]
class Solution
{
  public int[][] reshape(int[][] mat, int r, int c)
  {
    int row = mat.length;
    int col = mat[0].length;
    if((row*col)!=(r*c))
    {
      return mat;
    }
    int[][] output = new int[r][c];
    int rw=0;
    int cl=0;
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        output[rw][cl] = mat[i][j];
        cl++;
        if(cl == col)
        {
          cl=0;
          rw++;
        }
      }
    }
    return output;
  }
}
//Time : O{mn} , m = number of rows, n = number of columns












