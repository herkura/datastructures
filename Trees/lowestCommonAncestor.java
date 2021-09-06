//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

// Note : According to the definition of LCA on Wikipedia:
//“The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants
//(where we allow a node to be a descendant of itself).”

//Fow eg1: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
// Output: 6

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
  {
    if(root == null)
    {
      return null;
    }
    if(p.val<root.val && q.val<root.val)
    {
      //search in the left sub tree
      return lowestCommonAncestor(root.left, p,q);
    }
    else if(p.val>root.val && q.val>root.val)
    {
      return lowestCommonAncestor(root.right,p,q);
    }
    return root;
  }
}
