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

  public void addHead(int data) {
    Node newNode;
    
    newNode = new Node(data);
    if (isEmpty()) {
        HEAD = newNode;
    } else {
        newNode.setNext(HEAD);
        HEAD = newNode;
    }
  }

  public void addMid(int data, int position) {
    Node previousNode = null, currentNode, newNode;
    int i = 1;

    newNode = new Node(data);
    if (HEAD == null) {
      HEAD = newNode;
    } else {
      currentNode = HEAD;
      if (position == 1) {
          newNode.next = currentNode;
          HEAD = newNode;
      } else {
          while (currentNode != null && i < position) {
              previousNode = currentNode;
              currentNode = currentNode.next;
              i++;
          }
          previousNode.next = newNode;
          newNode.next = currentNode;
      }
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
    if (HEAD != null) {
      boolean ketemu = false;
      int i = 1;
      Node delNode = HEAD;
      Node preNode = null;
      while (delNode.next != null && !ketemu) {
        if (delNode.data == x) {
          ketemu = true;
        } else {
          preNode = delNode;
          delNode = delNode.next;
          i++;
        }
      }
      if (ketemu) {
        if (i == 1) {
          HEAD = HEAD.next;
        } else {
          preNode.next = delNode.next;
          delNode = null;
        }
      }
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
