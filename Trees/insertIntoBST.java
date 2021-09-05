//You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion.
//It is guaranteed that the new value does not exist in the original BST.

//for eg1 : root = [4,2,7,1,3], val = 5
// Output: [4,2,7,1,3,5]
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
          root = new TreeNode(val);  
          return root;
        }
      if(val>root.val)
      {
        root.right = insertIntoBST(root.right,val); 
      }
      else
      {
        root.left = insertIntoBST(root.left,val);
      }
      return root; 
      }
}
