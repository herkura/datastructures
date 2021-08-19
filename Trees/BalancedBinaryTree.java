//Given a Binary tree, determine if it is height-balanced.
//Note: a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
//eg 1 : root=[1,2,2,3,3,null,null,4,4]
//output : false
//eg 2 : root=[3,9,20,null,null,15,7]
//output: true
//My approach
//Find the depth using bottom up approach
//if depth is > 1 return false
//if depth of left subtree is -1, return false
//if depth of right subtree is -1, return false
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
  public boolean isBalanced(TreeNode root)
  {  
    return depth(root)!=-1;
  }
  private int depth(TreeNode root)
  {
    if(root == null)
    {
      return 1;
    }
    int left_depth = depth(root.left);
    if(left_depth == -1)
    {
      return -1;
    }
    
    int right_depth = depth(root.right);
    if(right_depth == -1)
    {
      return -1;
    }
    int diff = Math.abs(left_depth - right_depth);
    if(diff>1)
    {
      return -1;
    }
    return Math.max(left_depth,right_depth);
  }
}

  
