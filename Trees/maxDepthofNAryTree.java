//Given a n-ary tree, find its maximum depth.
//root = [1,null,3,2,4,null,5,6]
//Output: 3
//To do this we can go woth both dfs as well as bfs
//This Solution is using a dfs to iterate through the children
//Time : O(N)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution
{
  private int max_depth;
  public int maxDepthofNAryTree(Node root)
  {
    dfs(root,1); // According to the testcase the root node has depth 1
    return max_depth;
  }
  public void dfs(Node root, int depth)
  {
    if(root == null) 
      return;
    for(Node child:root.children)
    {
      dfs(child,depth+1);
    }
    max_depth = Math.max(max_depth,depth);
  }
}
