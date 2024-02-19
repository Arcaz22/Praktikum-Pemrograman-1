package list;

public class TestList {
  public static void main(String[] args) {
    System.out.println("Add tail");
    StrukturList addTail = new StrukturList();
    addTail.addTail(2);
    addTail.addTail(1);
    addTail.addTail(3);
    addTail.addTail(5);
    addTail.addTail(4);
    addTail.display();
  }
}
