package sorting;

import java.util.Arrays;

public class SortingTest {
  public static void main(String[] args) {

    System.out.println("Hasil Looping");
    for(int i = 0; i < 2; i++) {
      for(int j = 6; j < 8; j++) {
        System.out.println("[" + i + "," + j + "]");
      }
    }

    System.out.println("----------------------------------");
    System.out.println("Bubble Sort");
    int[] data = {4, 7, 6, 2, 8, 3};
    Sorting bubbleSort = new Sorting();
    bubbleSort.bubbleSort(data);
    System.out.println("Sorted data: " + Arrays.toString(data));
    
    System.out.println("----------------------------------");
    System.out.println("Insertion Sort");
    data = new int[]{4, 7, 6, 2, 8, 3};
    Sorting insertionSort = new Sorting();
    insertionSort.insertionSort(data);
    System.out.println("Sorted data: " + Arrays.toString(data));
  }

}
