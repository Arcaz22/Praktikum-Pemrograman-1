package list;

public class Node {
    MataKuliah data;
    Node next;

    public Node(MataKuliah data) {
        this.data = data;
    }

    public MataKuliah getData() {
        return data;
    }

    public void setData(MataKuliah data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
