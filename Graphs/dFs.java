//Implementing Depth First Search using recursive function
//Time : O(V+E)
//Space : O(V)
import java.util.*;
class Graph
{
  private int v;
  private ArrayList<ArrayList<Integer> adj;
  Graph(int v)
  {
    this.v=v;
    adj = new ArrayList<ArrayList<Integer>>(v);
  }
  
  private void addEdge(int src, int dest)
  {
    adj.get(src).add(dest);
  }
  
  private void dfsInit(int v, boolean[] visited)
  {
    //mark all the vertices as visited
    visited[v] = true;
    System.out.print(v+"");
    for(int i:adj.get(v))
    {
      if(!visited[i]))
      {
        dfsInit(i,visited);
      }
    }
  }
  private void dfs(int v)
  {
    boolean[] visited = new boolean[v];
    dfsInit(i,visited);
  }
  public static void main(String[] args)
  {
   
    Scanner sc = new Scanner(System.in);
    int v=  sc.nextInt();
     Graph g = new Graph(v);
    int src= sc.nextInt();
    int dest = sc.nextInt();
    for(int i=0;i<v;i++)
    {
      addEdge(src,dest);
    }
    dfs(v);
  }
}
