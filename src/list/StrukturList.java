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
