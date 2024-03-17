package list;

public class TestList {
  public static void main(String[] args) {
    System.out.println("Add tail");
    StrukturList addTail = new StrukturList();
    addTail.addTail(2);
    addTail.addTail(6);
    addTail.addTail(3);
    addTail.display();

    System.out.println("\n---------------");
    System.out.println("Find 6: " + addTail.find(6)); 
    System.out.println("Find 4: " + addTail.find(4)); 

    System.out.println("\n---------------");
    System.out.println("Size of list: " + addTail.size());
  }
}
