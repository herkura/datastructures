// Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
// Note : A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
//eg 1 : nums = [-10,-3,0,5,9]
//output : [0,-3,9,-10,null,5]
//so we have to create a bst from an array so we can use two pointers left and right
// in the above eg 0 which is the root of the bst is present in the middle of the array
//so we will perform a binary search to find the middle
//then for the left node and the right node we will perform recursion for iterating through the left and right subtrees
/*class TreeNode
{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(){}
  TreeNode(int val)
  {
    this.val=val;
  }
  TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
*/
class Solution
{
   public TreeNode sortedArrayToBST(int[] nums)
   {
     if(nums.length==0)
     {
       return null;
     }
     return constructBST(nums,0,nums.length-1);
   }
  private TreeNode constructBST(int[] nums, int left, int right)
  {
     //Boundary condition
    if(left>right)return null;
    int mid = left + (right - left)/2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = constructBST(nums,left,mid-1);
    root.right = constructBST(nums,mid+1,right);
    return root;
  }
}
//Time : O(N)
//space : O(N)































