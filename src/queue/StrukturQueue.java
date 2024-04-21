package queue;

public class StrukturQueue {
  private Node FRONT;
  private Node REAR;

  public int size() {
    int size = 0;
    Node curNode = FRONT;
    while (curNode != null) {
        size++;
        curNode = curNode.next;
    }
    return size;
  }

  public int front() {
    return FRONT != null ? FRONT.getData() : -1;
  }

  public boolean isEmpty() {
    return FRONT == null;
  }

  public void enqueue(int data) {
    Node newNode = new Node(data);
    if(isEmpty()) {
      FRONT = newNode;
      REAR = newNode;
    } else {
      REAR.setNext(newNode);
      REAR = newNode;
    }
  }

  public int dequeue() {
    Node temp;
    int dequeuedItem = Integer.MIN_VALUE;
    if (FRONT != null) {
      if (FRONT == REAR) {
        dequeuedItem = FRONT.data;
        FRONT = null;
        REAR = null;
      } else {
        temp = FRONT;
        dequeuedItem = temp.data;
        FRONT = FRONT.next;
        temp = null;
      }
    }
    return dequeuedItem;
  }

  public void display() {
    Node curNode = FRONT;
    while (curNode != null) {
      System.out.print(curNode.getData() + " ");
      curNode = curNode.next;
    }
    System.out.println();
  }
}
