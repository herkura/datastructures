// Given a DIRECTED graph ,we have to check if the graph has cycles or not
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Graph
{
  private int v;
  private List<List<Integer>> adj;
  public Graph(int v)
  {
    this.v=v;
    adj = new ArrayList<>(v);
    for(int i=0;i<v;i++)
    {
      adj.add(new LinkedList<>());
    }
  }
  private void addEdge(int src, int dest)
  {
    adj.get(src).add(dest);
  }
  private boolean isCyclicInit(int v,boolean[] visited,boolean[] recStack)
  {
    visited[v] = true;
    recStack[v] = true;
    if(visited[v])
      return false;
    if(recStack[v])
    {
      return true;
    }
    for(int i:adj.get(v))
    {
      if(isCyclicInit(i,visited,recStack))
      {
        return true; 
      }
    }
    recStack[v]=false;
    return false;
  }
  private boolean isCyclic()
  {
    boolean[] visited = new boolean[v];
    boolean[] recStack = new boolean[v];
    for(int i=0;i<v;i++)
    {
      if(isCyclicInit(i,visited,recStack))
      {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    Graph g = new Graph(v);
    int src = sc.nextInt();
    int dest = sc.nextInt();
    for(int i=0;i<v;i++)
    {
      addEdge(src,dest);
    }
    g.isCyclic();
  }
}
//Time complexity : O(v+e)
