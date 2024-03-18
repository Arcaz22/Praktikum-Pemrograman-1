package list;

public class StrukturList {
  private Node HEAD;
  
  private boolean isEmpty() {
    return (HEAD == null);
  }

  public void addHead(MataKuliah data) {
    Node newNode;
    
    newNode = new Node(data);
    if (isEmpty()) {
        HEAD = newNode;
    } else {
        newNode.setNext(HEAD);
        HEAD = newNode;
    }
  }

  public void display() {
    if(isEmpty()) {
      System.out.println("List is empty");
    } else {
      Node current = HEAD;
      while(current != null) {
        System.out.println("Mata Kuliah: " + current.getData().getKode() + " " + current.getData().getNama() + " " + current.getData().getSks());
        current = current.getNext();
      }
    }
  }
}
