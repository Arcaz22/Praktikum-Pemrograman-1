package list;

public class TestList {
  public static void main(String[] args) {
    System.out.println("Add head, mid, tail");
    StrukturList addMid = new StrukturList();
    addMid.addTail(2);
    addMid.addTail(6);
    addMid.addTail(3);
    addMid.addTail(5);
    addMid.addTail(1);
    addMid.display();

    System.out.println("\n ----------------------------------");
    System.out.println("Remove Head");
    addMid.removeHead();
    addMid.display();

    System.out.println("\n ----------------------------------");
    System.out.println("Remove Tail");
    addMid.removeTail();
    addMid.display();

    System.out.println("\n ----------------------------------");
    System.out.println("Remove Mid");
    addMid.removeMid(9);
    addMid.display();
  }
}
