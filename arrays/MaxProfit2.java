//A function that returns the max profit by selling the stock on multiple days
//Time : O(n);
Class Solution
{
  public int Maxprofit(int[] prices)
  {
    int max = 0;
    for(int i=1;i<prices.length;i++)
    {
      if(proces[i]>prices[i-1])
      {
        max+=prices[i] - prices[i-1];
      }
    }
    return max;
  }
}
