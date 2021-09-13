//Given the root of a binary tree, return the sum of all left leaves.
// to check if a node is a leaf node we will check that left and right children are null
//for eg1: root = [3,9,20,null,null,15,7]
// Output: 24
//explanation : 
/*
      3
   /      \
  9        20
 /  \     /  \
null null 15  7
So here we will be addding 9+15 to get 24
*/
//time : O(N)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
  public int sumOfLeftLeaves(TreeNode root)
  {
    if(root == null)
    {
      return null;
    }
    else if(root.left!=null && root.left.left == null && root.left.right == null)
    {
      return root.left.val + sumOfLeftLeaves(root.right);
    }
    else
    {
      return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
  }
}
