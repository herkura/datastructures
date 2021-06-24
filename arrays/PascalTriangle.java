//Function that prints pascal triangle based on the number of rows.
//Time Complexity: O(n^2) 
class Solution
{
  public List<List<Integer>> gen(int numRows)
  {
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    if(numRows == 0)
    {
      return triangle;
    }
    //adding the first row i.e 1
    List<Integer> firstRow = new List<>();
    firstRow.add(1);
    triangle.add(firstRow);
    //adding the rest of the rows
    for(int i=1;i<numRows;i++)
    {
      List<Integer> prevRow = triangle.get(i-1);
      List<Integer>  currRow  = new ArrayList<>();
      currRow.add(1);
      //iterating within the row
      for(int j=1;j<i;j++)
      {
        currRow.add(prevRow.get(j-1) + prevRow(j));
      }
      currRow.add(1);
      triangle.add(currRow);
    }
    return triangle;
  }
}
