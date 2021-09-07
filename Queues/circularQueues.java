// circular queues are an efficient way to save extra space which is lost while implementing the queue
class Myqueue
{
  private int[] data;
  private int head;
  private int tail;
  private size;
  public Myqueue(int k)
  {
    data = new int[k];
    head=-1;
    tail=-1;
    size=k;
  }
  
  public boolean enqueue(int x)
  {
    if(isFull() == true)
    {
      return false;
    }
    if(isEmpty() == true)
    {
      head=0;
    }
    tail = (tail+1)%size; // means that the tail will move tail + 1 steps.
    data[tail] = x;
    return true;
  }
  
  public boolean dequeue()
  {
    if(isEmpty() = true)
    {
      return false;
    }
    if(head == tail)
    {
      head=-1;
      tail=-1;
    }
    head = (head+1)%size;
    return true;
  }
  public int Front()
  {
    if(isEmpty() == true)
    {
      return -1;
    }
    return data[head];
  }
  public int Rare()
  {
    if(isEmpty() == true)
    {
      return -1;
    }

      return data[tail];
  }
  
  public boolean isEmpty()
  {
    return head=-1;
  }
  
  public boolean isFull()
  {
    return ((tail+1)%size) == head;
  }
 }
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
