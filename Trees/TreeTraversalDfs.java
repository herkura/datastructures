//Tree traversal can be done using bfs and dfs.
//Implementing dfs traversal for a binary tree
//In dfs there are 3 kinds: a) Inorder -> (left,root,right)
//                          b) Preorder -> (root,left,right)
//                          c) Postorder -> (left,right,root)
import java.util.*;
class ListNode
{
  int val;
  ListNode left;
  ListNode right;
  ListNode(int val)
  {
    this.val = val;
    this.left = this.right = null;
  }
}
class BinaryTree
{
  ListNode root;
  BinaryTree()
  {
    this.root = null;
  }
  void Inorder(ListNode node)
  {
    if(node != null)
     Inorder(node.left);
     System.out.print(node.val);
     Inorder(node.right);
    return;
  } 
  void Preorder(ListNode node)
  {
    if(node != null)
    {
     System.out.print(node.val);
     Preorder(node.left);
     Preorder(node.right);
    }
    return;
  }
  void Postorder(ListNode node)
  {
    if(node!=null)
    {
     Postorder(node.left);
    Postorder(node.right);
    System.out.print(node.val);
    }
   return;
  }
   void Inorder(){Inorder(root)};
   void Preorder(){Preorder(root)};
   void Postorder(){Postorder(root)};
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(val);
    tree.root.left = new Node(val);
    tree.root.right = new Node(val);
    tree.root.left.left = new Node(val);
    tree.root.left.right = new Node(val);
    System.out.print(Inorder());
    System.out.print(Preorder());
    System.out.print(Postorder());
    
  }
}
  
