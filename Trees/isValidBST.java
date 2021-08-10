//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
/*
A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
*/
//for eg:root = [5,1,4,null,null,3,6]
// output :  false
//Explanation: The root node's value is 5 but its right child's value is 4.
//approach to solve the check if the tree is in inorder then return true
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
class Solution {
  private Integer prev;
    public boolean isValidBST(TreeNode root) {
     prev = null;
      return inorder(root);
    }
 public boolean inorder(TreeNode root)
 {
   if(root==null)
   {
    return true;
   }
   if(!inorder(root.left))
   {
     return false;
   }
  //checking the value
   if(prev != null && root.val<=prev)
   {
     return false;
   }
   prev = root.val; //updating the value of the prev node 
   if(!inorder(root.right))
     return false;
   return true;
 }
    
}
//Time: O(N), Space: O(N)
