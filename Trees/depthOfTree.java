//The depth of a tree can be implemented using 2 ways : 1) Top Down approach ,2) Bottom Up approach
//Top down approach
//defining the node
/*public class TreeNode {
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
class topDownapproach
{
  public int max_depth(TreeNode root,int depth)
  {
    int result;
    if(root == null)
    {
      return 0;
    }
     //checking if root is a leaf node
    if(root.left == null && root.right == null)
    {
      result = Math.max(result,depth);
    }
    max_depth(root.left,depth+1);
    max_depth(root.right,depth+1);
    return result;
  }
}

// Bottom up approach
//defining the node
/*public class TreeNode {
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
class bottomUpapproach
{
  public int maxDepth(TreeNode root)
  {
    if(root == null)
    {
      return 0;
    }
    int leftLen = maxDepth(root.left);
    int rightLen = maxDepth(root.right);
    int depth = Math.max(leftLen,rightLen);
    return depth+1;
    
  }
}
//time : O(N)
