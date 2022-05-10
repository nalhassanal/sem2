package week7.spectrum;
public class GenericQueue<E> {
  private java.util.LinkedList<E> list = new java.util.LinkedList<>();

  public void enqueue(E e) {
    list.addLast(e);
  }

  public E dequeue() {
    return list.removeFirst();
  }

  public int getSize() {
    return list.size();
  }

  public E front() {
    return list.get(0);   
  }
  
  public E back(){
      return list.get(getSize()- 1);
  }
  
  public boolean isEmpty(){
      return list.isEmpty();
  }
  @Override
  public String toString() {
    return "Queue: " + list.toString();
  }
}
