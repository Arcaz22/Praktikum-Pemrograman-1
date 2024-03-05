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

  public void removeHead() {
    if (isEmpty()) {
      System.out.println("List Kosong");
    } else {
      Node temp = HEAD;
      HEAD = HEAD.getNext();
      temp = null;
    }
  }

  public void removeTail() {
    if (HEAD != null) {
      if (HEAD.next == null) {
        HEAD = null;
      } else {
        Node lastNode = HEAD;
        Node preNode = null;
        while (lastNode.next != null) {
            preNode = lastNode;
            lastNode = lastNode.next;
        }
        preNode.next = null;
        lastNode = null;
      }
    }
  }

  public void removeMid(int x) {
    Node previousNode = null, 
    currentNode = HEAD;
    boolean found = false;

    if (isEmpty()) {
      System.out.println("List Kosong");
      return;
    }
  
    while (currentNode != null && !found) {
      if (currentNode.getData() == x) {
        found = true;
      } else {
        previousNode = currentNode;
        currentNode = currentNode.getNext();
      }
    }

    if (!found) {
      System.out.println("Node dengan nilai " + x + " tidak ditemukan!");
      return;
    }
  
    if (previousNode == null) {
      HEAD = HEAD.getNext();
    } else {
      previousNode.setNext(currentNode.getNext());
    }
  
    currentNode.setNext(null);
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
