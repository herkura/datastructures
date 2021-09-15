// Given the root of a binary tree, invert the tree, and return its root.

// for eg1 : root = [2,1,3]
//output : [2,3,1]

// right subtree = left subtree and vice versa
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
  public TreeNode invertBinaryTree(TreeNode root)
  {
    if(root == null)
    {
      return null;
    }
    TreeNode Left = invertBinaryTree(root.left);
    TreeNode Right = invertBinaryTree(root.right);
    root.right = Left;
    root.left = Right;
    return root;
    
  }
}
//Time : O(N)
