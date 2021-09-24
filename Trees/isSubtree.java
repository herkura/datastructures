//Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

//A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
//for eg1 :root = [3,4,5,1,2], subRoot = [4,1,2]
//Output: true
//definition of the data structure 
/*class TreeNode 
{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
*/
class Solution
{
  public boolean isSame(TreeNoden t1, TreeNode t2)
  {
    if(t1==null && t2==null)
    {
      return true;
    }
    if(t1==null || t2 == null)
    {
      return false;
    }
    return (t1.val == t2.val) && (isSame(t1.left,t2.left)) && (isSame(t1.right,t2.right));
    
  }
  public boolean isSubtree(TreeNode root, TreeNode subroot)
  {
    if(isSame(root,subroot))
    {
      return true;
    }
    return root != null && (isSubtree(root.left,subroot) || isSubtree(root.right ,subroot));   
  }
}
