// Given the root of a binary tree, return all root-to-leaf paths in any order.

//A leaf is a node with no children.

//root = [1,2,3,null,5]
//Output: ["1->2->5","1->3"]
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new ArrayList<>();
      if(root == null)
      {
        return ls;
      }
      dfs(root,"",ls);
      return ls;
    }
 private void dfs(TreeNode root,String s,List<String> ls)
 {
   s+=root.val;
   if(root.left==null && root.right==null)
   {
     ls.add(s);
     return;
   }
   if(root.left!=null)
   {
     dfs(root.left,s+"->",ls);
   }
    if(root.right!=null)
   {
     dfs(root.right,s+"->",ls);
   }
   
   
 }
}
