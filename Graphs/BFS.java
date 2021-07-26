//Implementing BFS in a directed graph
//we will be implementing it like a tree
//we will use a queue to store the node value and the poll the node values
// we will be giving an input List 
class Solution
{
  static class Node
  {
    int val;
    List<Node> children = new ArrayList<Node>();
    public Node(int val)
    {
      this.val = val;
    }
  
  public ArrayList<Integer> bfs(ArrayList<Integer> nums)
  {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(this); // add all the vertices into queue
    while(!queue.isEmpty())
    {
      Node curr = queue.poll();//Deque
      nums.add(curr.val);
      queue.addAll(curr.children);
    }
    return nums;
  }
  //adding children in the graph
  public Node addChildren(int edge)
  {
    Node e = new Node(edge);
    children.add(e);
    return this;
  }
  }
}
//Time : O(v+e) space: O(v)
