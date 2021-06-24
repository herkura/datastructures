//Function that returns the max profit from 1 transaction
//Given an array and the ith element in that array is the prices of the stock on i day.
//For eg: [7,1,5,3,6,4] => output = 5 => 6-1
//Time complexity : O(n) 
class Solution
{
  public int maxProfit(int[] prices)
  {
    //creating a local Min element which will be updated as we iterate
    int localMin = prices[0];
    int profit = Integer.MIN_VALUE;
    for(int i=0;i<prices.length;i++)
    {
      //comparing the local min with other elements of the array.
      //then updating it
      if(prices[i]<localMin)
      {
        localMin = prices[i];
      }
      //check the profit
      if(profit<(prices[i] - localMin))
      {
        profit = prices[i] - localMin;
      }
    }
    return profit;
    
  }
    
}
