//Time : O(n^2) || space: O(1)
class Solution
{
  public static int[] insertionSort(int[] nums)
  {
    if(nums.length==0)
    {
      return new int[]{};
    }
    for(int i=1;i<nums.length;i++)
    {
      int j=i;
      while(j>0 && nums[j]<nums[j-1])
      {
        int temp = array[j-1];
	array[j-1] = array[j];
	array[j] = temp;
	j-=1;
      }
    }
    return nums;
  }
	public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i=0;i<n;i++)
    {
      nums[i] = sc.nextInt();
    }
    System.out.print(quicksort(nums));
  }
}
