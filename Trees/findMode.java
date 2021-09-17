// Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.
//for eg1: root = [1,null,2,2]
// Output: [2]
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
  HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
      dfs(root);
      List<Integer> ls = new ArrayList<Integer>();
      int max_count = Collections.max(map.values());
      for(int i:map.keySet())
      {
        if(map.get(i) == max_count)
        {
          ls.add(i);
        }
      }
      int[] res = new int[ls.size()];
      for(int i=0;i<ls.size();i++)
      {
        res[i] = ls.get(i);
      }
     return res; 
    }
  public void dfs(TreeNode root)
  {
    if(root == null)
    {
      return;
    }
    map.put(root.val,map.getOrDefault(root.val,0)+1);
    dfs(root.left);
    dfs(root.right);

  }
}
