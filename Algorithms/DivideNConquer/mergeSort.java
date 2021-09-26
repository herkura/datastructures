//Merge Sort is a divide and conquer approach to sort the elements
//time complexity of my solution is : O(nlogn) | space complexity of this solution is O(nlogn)
class Solution
{
  public static int[] mergeSort(int[] nums)
  {
      if(nums.length<=1)
      {
        return nums;
      }
    int mid = nums.length/2;
    int[] left = Arrays.copyOfRange(nums,0,mid);
    int[] right = Arrays.copyOfRange(nums,mid,nums.length);
    
    return helper(mergeSort(left),mergeSort(right));
  }
  public static int[] helper(int[] left, int[] right)
  {
    int[] sorted_array = new int[left.length+right.length];
    int i=0,j=0,k=0;
    while(i<left.length && j<right.length)
    {
      if(left[i]<=right[j])
      {
        sorted_array[k++] = left[i++];
      }
      else
      {
        sorted_array[k++] = right[j++];
      }
    }
    while(i<left.length)
    {
      sorted_array[k++] = left[i++];
    }
    while(j<right.length)
    {
      sorted_array[k++] = right[j++];
    }
    return sorted_array;
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
