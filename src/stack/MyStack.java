package stack;

public class MyStack extends AbstractStack{
  public MyStack(int capacity) {
    super(capacity);
  }

  public int peekN(int n) {
    return arr[n];
  }

  public void displayStack(String s) {
    System.out.println(s);
    System.out.println("Stack(Bottom -->): ");
    for (int i = 0; i <= TOP; i++) {
      System.out.println(peekN(i));
      System.out.println(" ");
    }
    System.out.println("");
  }
}
