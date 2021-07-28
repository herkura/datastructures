// Checking  cycles in an UNDIRECTED graph
//If the vertice v has adjascent vertice u such that u is not the child of v and u is visited then there is a cycle
//Time complexity: O(v+e)
class Graph
{
  private int v;
  private ArrayList<ArrayList<Integer>> adj;
  Graph(int v)
  {
    this.v=v;
    adj = ArrayList<ArrayList<Integer>>(v);
    for(int i=0;i<v;i++)
    {
      adj.add(new ArrayList<Integer>());
    }
  }
  private void addEdge(int src,int dest)
  {
    adj.get(src).add(dest);
  }
  private boolean UndirectedCyclic(int v, boolean[] visited, int parent)
  {
    visited[v]=true;
    for(int i:adj.get(v))
    {
      if(!visited[i])
      {
        UndirectedCyclic(i,visited,v);
        return true;
      }
      else if(i!=parent)
      {
        return true;
      }
    }
    return false;
  }
  private boolean hasCycles()
  {
    boolean[] visited = new boolean[v];
    for(int i=0;i<v;i++)
    {
      visited[i]=false;
    }
    for(int i=0;i<v;i++)
    {
      if(!visited[i])
      {
        if(UndirectedCyclic(i,visited,-1))
        {
           return true;
        }
        
      }
    }
    return false;
  } public static void main(String[] args)
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
