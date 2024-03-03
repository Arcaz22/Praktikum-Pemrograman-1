package list;

public class TestList {
  public static void main(String[] args) {
    System.out.println("Add head, mid, tail");
    StrukturList addMid = new StrukturList();
    addMid.addTail(3);
    addMid.addTail(4);
    addMid.addMid(7, 2);
    addMid.addMid(8, 2);
    addMid.addHead(5);
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
    addMid.removeMid(7);
    addMid.display();
}
}
