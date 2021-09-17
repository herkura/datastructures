//Given the root of a binary tree and an integer targetSum
// return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

// For eg1: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], target = 20
// Output: false

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
  public boolean pathSum(TreeNode root, int target)
  {
    if(root == null)
    {
      return false;
    }
    else if(root.left == null && root.right == null && target - root.val == 0)
    {
      return true;
    }
    else
    {
      return pathSum(root.left, target - root.val) || pathSum(root.right, target - root.val);
    }
  }
}
