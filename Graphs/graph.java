// Implementing graph using adjascnecy list
//using generic classes
class Graph<H>
{
  private Map<H, List<H>> map = new HashMap<>();
  //Method for adding a vertex in the graph
  public void addVertex(H data)
  {
     map.put(data,LinkedList<H>());
  }
  //Method for adding an edge in the graph
  public void addEdge(H src , H dest, boolean direction)
  {
    if(!map.containsKey(src))
    {
      addVertex(src);
    }
    if(!map.containsKey(dest)
    {
      addVertex(dest);
    }
    map.get(src).add(dest);
    if(direction == true)
    {
      map.get(dest).add(src);
    }
   }
    //Method to check if there is vertex or not
    public boolean hasVertex(H src)
    {
       if(map.containsKey(src))
       {
          return true; 
       }
       addVertex(src);
       return false;
    }
    //Method to check if there are edges or not
    public boolean hasEdges(H src, H dest)
    {
       if(map.containsValue(dest))
       {
         return true;
       }
       addVertex(dest);
       return false;
    }
    //counting the total number of vertices
    public void countVertex()
    {
       for(H s:map.keySet())
       {
          System.out.println("Total number of vertices :" + map.keySet().size());
       }
    }
    //counting the number of edges
    public void countEdges(boolean dir)
    {
      int count=0;
      for(H c:map.keySet())
      {
         count+=map.get(c).size();
      }
      if(dir == true)
      {
        count=count/2;
      }
      System.out.println(count);
    }
    @Override 
    public String toString()
    {
      StringBuilder sb = new StringBuilder();
      for(H v:map.keySet())
      {
        sb.append(v.toString()); //adding vertices
        for(H e:map.get(v))
        {
          sb.append(e.toString()); //adding edges
        }
        sb.append(" ");
      }
      return sb.toString();
    }
  }
public class Main
{
   public static void main(String[] args)
   {
     Graph<Integer> g = new Graph<Integer>();
     g.addEdge(0,1,true);
     g.addEdge(1,2,true);
     g.addEdge(0,2,true);
     System.out.println(g.toString());
     g.countVertex();
     g.countEdges(true);
     g.hasEdge(3, 4);//output: false
     g.hasVertex(0);

   }
}
