//Designing a qeue using dynamic array
//Main operations in a qeue are : 1) Enqeue (Insertion),O(1)
//                                2) Deqeue (Deletion),O(1)
//Here ArrayLists will be used to store the data, though a linked list can be used too
class MyQeue
{
  private List<Integer> data;
  private int startIdx;
  MyQeue()
  {
     data = new ArrayList<>();
     startIdx = 0;
  }
  /** Insert an element into the queue. Return true if the operation is successful. */
  public boolean enqeue(int x)
  {
    data.add(x);
    return true;
  }
  /** Delete an element from the queue. Return true if the operation is successful. */
  public boolean deqeue()
  {
    if(isEmpty() == true)
    {
      return false;
    }
    startIdx++;
    return true;
  }
  /** Get the front item from the queue. */
  public int front()
  {
    return data.get(startIdx);
    
  }
  /*check if the qeue is still empty or not*/
  public boolean isEmpty()
  {
    return startIdx >= data.size();
  }
};
public class Main
{
  public static void main(String[] args)
  {
    MyQeue q = new MyQeue();
    q.enQueue(5);
    q.enQueue(2);
    if (q.isEmpty() == false) {
       System.out.println(q.Front());
        }
    q.deQueue();
    if (q.isEmpty() == false) {
      System.out.println(q.Front());
        }
  }
  
}
