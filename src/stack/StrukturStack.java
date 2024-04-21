package stack;

public class StrukturStack {
  private int[] array;
    private int capacity;
    private int TOP;

  public final int MIN = -1;

  public StrukturStack(int capacity) {
    array = new int[capacity];
    this.capacity = capacity;
    TOP = MIN;
  }
  
  public boolean isEmpty() {
    return (TOP == MIN);
  }

  public boolean isFull() {
    return (TOP == capacity - 1);
  }

  public int size() {
    return TOP;
  }
  
  // public int top() {
  //   if (TOP == MIN) {
  //       return -1;
  //   } else {
  //       return array[TOP];
  //   }
  // }

  public int top() {
    return (TOP == MIN) ? -1 : array[TOP];
  }

  public void push(int data) {
    if (isFull()) {
      System.out.println("Stack Penuh");
    } else {
      TOP++;
      array[TOP] = data;
    }
  }

  public int pop() {
    int temp = -1;
    if (isEmpty()) {
      System.out.println("Stack Kosong");
    } else {
      temp = array[TOP];
      TOP--;
    }
    return temp;
  }
  
  public void display() {
    for(int i = TOP; i >= 0; i--) {
      if (i == TOP) {
        System.out.println("Elemen From TOP");
      }
      System.out.print(array[i] + " ");
    }
  }
}
