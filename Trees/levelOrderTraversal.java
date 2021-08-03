//Implementing bfs in a tree
//steps: 1) create a queue and add the nodes 
//       2) create a temp node and assign the poll value of the queue
//       3) enqueue the left and the right sub-tree nodes while the queue is not empty
//Time complexity: O(N) Space : O(N)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class Node
{
  int val;
  Node left,right;
  public Node(int val)
  {
    this.val = val;
    left = null;
    right = null;
  }
}
class BinaryTree
{
  Node root;
  void levelOrder()
  {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty())
    {
      Node temp = queue.poll();
      System.out.print(temp.val + " ");
      if(temp.left!=null)
      {
        queue.add(temp.left);
      }
      if(temp.right!=null)
      {
        queue.add(temp.right);
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(n);
    tree.root.left = new Node(n);
    tree.root.right = new Node(n);
    tree.root.left.left = new Node(n);
    tree.root.left.right = new Node(n);
    tree.root.left.left.left = new Node(n);
    tree.levelOrder();
  }
}
