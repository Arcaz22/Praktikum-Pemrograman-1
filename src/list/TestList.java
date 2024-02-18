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

    System.out.println("\n ----------------------------------");
    System.out.println("Add Head");
    StrukturList addHead = new StrukturList();
    addHead.addHead(2);
    addHead.addHead(1);
    addHead.addHead(3);
    addHead.display();

    System.out.println("\n ----------------------------------");
    System.out.println("Add head, mid, tail");
    StrukturList addMid = new StrukturList();
    addMid.addTail(3);
    addMid.addTail(4);
    addMid.addMid(7, 2);
    addMid.addMid(8, 2);
    addMid.addHead(5);
    addMid.display();
  }
}
