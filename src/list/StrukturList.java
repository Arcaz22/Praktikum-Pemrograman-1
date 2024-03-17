package list;

public class StrukturList {
  private Node HEAD;
  
  private boolean isEmpty() {
    return (HEAD == null);
  }

  public void addTail(int data) {
    Node previousNode = null, currentNode, newNode;

    newNode = new Node(data);

    if (isEmpty()) {
        HEAD = newNode;
    } else {
        currentNode = HEAD;
        while (currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(newNode);
    }
  }

  public boolean find(int x) {
    Node currentNode;
    boolean found;

    currentNode = HEAD;
    found = false;
    
    while(currentNode != null && !found) {
      if (currentNode.getData() == x) 
        found = true;
      else 
        currentNode = currentNode.getNext();
    }
    return found;
  }

  public int size() {
    Node currentNode;
    int amount;

    currentNode = HEAD;
    amount = 0;
    while (currentNode != null) {
      amount++;
      currentNode = currentNode.next;
    }
    return amount;
  }

  public void display() {
    Node currentNode = HEAD;
    while (currentNode != null) {
        System.out.print(currentNode.getData());
        if (currentNode.getNext() != null) {
            System.out.print(" -> ");
        }
        currentNode = currentNode.getNext();
    }
  }
}
