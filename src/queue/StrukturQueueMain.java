package queue;

public class StrukturQueueMain {
  public static void main(String[] args) {
    StrukturQueue queue = new StrukturQueue();

    // Sebelum
    System.out.println("Sebelum");
    System.out.println("Size: " + queue.size());
    System.out.println("IsEmpty: " + queue.isEmpty());
    System.out.println("Front: " + queue.front());
    System.out.print("Element Queue: ");
    queue.display();

    // Operasi enqueue
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    // Sesudah enqueue
    System.out.println("\nSesudah enqueue");
    System.out.println("Size: " + queue.size());
    System.out.println("IsEmpty: " + queue.isEmpty());
    System.out.println("Front: " + queue.front());
    System.out.print("Element Queue: ");
    queue.display();

    // Operasi dequeue
    queue.dequeue();

    // Sesudah dequeue
    System.out.println("\nSesudah dequeue");
    System.out.println("Size: " + queue.size());
    System.out.println("IsEmpty: " + queue.isEmpty());
    System.out.println("Front: " + queue.front());
    System.out.print("Element Queue: ");
    queue.display();
  }
}
