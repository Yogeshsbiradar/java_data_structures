import java.util.*;

class d{
  public static void main(String[] args){
    int o;
    Queue q = new LinkedList();
    q.add(1);
    q.add(3);
    q.add(5);
    q.add(65);
    System.out.println(q);
    System.out.println("q.peek() return head of the queue="+" "+q.peek());
    System.out.println("q.element() returns head of the queue="+" "+q.element());
    System.out.println("q.poll() removes and returns the head of the queue="+" "+q.poll());
    System.out.println("q.size() returns the size ="+" "+q.size());
    o=(int)q.remove();
    System.out.println(o);
    System.out.println(q);

  }
}