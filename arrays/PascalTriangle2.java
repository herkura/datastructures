//A function which returns the particular row of a pascal's triangle when a row index is given as input.
//for eg: rowIndex = 3 => output =  [1,3,3,1]
//Time Complexity:O(n)
class Solution
{
  public List<Integer> getRow(int rowIdx)
  {
    List<Integer> list = new ArrayList<>();
    int i = rowIdx;
    long val=1;
    for(int i=0;j<i+1;j++)//i+1 because we have to move to next column.
    {
      list.add((int)val);
      val = val*(i-j)/(j+1);
      
    }
    return list;
  }
}
