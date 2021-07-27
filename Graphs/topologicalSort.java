//Implementing Topological Sort
//topologcal Sort ensures that each and every node is visited
import java.util.*;
class Graph
{
   private int v;
   private ArrayList<ArrayList> adj;
  public Graph(int v)
  {
    this.v = v;
    adj = new ArrayList<ArrayList<Integer>>(v);
    for(int i=0;i<v;i++)
    {
      adj.add(new ArrayList<Integer>);
    }
  }
  // adding the edges in the graph
  public void addEdge(int src , int dest)
  {
    adj.get(src).add(dest);
  }
  //performing dfs
  public void dfs(int v,boolean[] visited,Stack<Integer> stack)
  {
     visited[v] = true;
     for(int i:adj.get(v))
     {
       if(!visited[i])
       {
         dfs(i,visited,stack);
       }
     }
    stack.push(new Integer(v));
  }
  //performing topological sort
  public void topologicalSort()
  {
    boolean[] visited = new boolean[v];
    for(int i=0;i<v;i++)
    {
      visited[i] = false;
    }
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<v;i++)
    {
      if(!visited[i])
         dfs(i,visited,stack);
    }
    while(!stack.isEmpty())
    {
      System.out.print(stack.pop() + "");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    Graph g = new Graph(n);
    int src = sc.nextInt();
    int dest = sc.nextInt();
   for(int i=0;i<n;i++)
   {
     System.out.print("Enter the source and destination: ");
     g.addEdge(src,dest);
   }
    g.topologicalSort();
  }
}
//Time Complexity : O(V+E)
//Space : O(V)
