//Implementing BFS in a directed graph
//we will be implementing it like a tree
//we will use a queue to store the node value and the poll the node values
// we will be giving an input List 
import java.util.*;
import java.util.List;
import java.util.Queue;
class Graph
{
  private int v;
  private ArrayList<ArrayList<Integer>> adj;
  Graph(int v)
  {
    this.v=v;
    adj = new ArrayList<ArrayList<Integer>>(v);
    for(int i=0;i<v;i++)
    {
      adj.add(new ArrayList<Integer>);
    }
  }
  void add(int src, int dest)
  {
    adj.get(src).add(dest);
  }
  void BFS(int v) // doing a bfs from a given vertex
  {
    boolean[] visited = new boolean[v];
    boolean[v] = true;
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(v);
    while(!q.isEmpty())
    {
     v = q.poll()
     System.out.print(v);
     //if the vertex is not visited
     for(int i:adj.get(v))
     {
       if(!visted[i])
       {
        visited[i] = true;
        q.add(i);
       }
     }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    System.out.print("Enter the number of vertices: ");
    Graph g = new Graph(v);
    int src = sc.nextInt();
    int dest = sc.nextInt();
    for(int i=0;i<v;i++)
    {
      g.add(src,dest);
    }
    System.out.println("Enter the vertex from where you want to do a BFS  : ");
    int vertex = sc.nextInt();
    
    g.BFS(vertex);
  }
}

//Time : O(v+e) space: O(v)
