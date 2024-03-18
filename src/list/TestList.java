package list;

public class TestList {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();
    list.addHead(new MataKuliah("IF1234", "Pemrograman Berorientasi Objek", 3));
    list.addHead(new MataKuliah("IF1567", "Algortima Pemrograman", 3));
    list.display();
  }
}
