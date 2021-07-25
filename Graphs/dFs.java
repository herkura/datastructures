//Implementing Depth First Search using recursive function
//Time : O(V+E)
//Space : O(V)
class Solution
{
  Static class Node
  {
    int data;
    List<Node> children = new ArrayList<Node>();
    public Node(int data)
    {
      this.data = data;
    }
  }
  public List<Integer> dFs(ArrayList<Integer> array)
  {
    array.add(this.data);
    for(int i=0;i<children.size();i++)
    {
      children.get(i).dFs(array);
    }
    return array;
  }
  public Node addChld(int e)
  {
    Node edge = new Node(e);
    children.add(edge);
    return this;
  }
}
