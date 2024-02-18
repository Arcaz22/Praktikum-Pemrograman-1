package sorting;

public class Sorting {
  public void bubbleSort(int[] data) {
    int temp;
    int i, j;

    for (i = 0; i < data.length - 1; i++) {
        System.out.println("Pernyataan ke-" + (i + 1));
        boolean swapped = false;

        for (j = 0; j < (data.length - 1) - i; j++) {
            if (data[j] > data[j + 1]) {
              
                temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
                swapped = true;

                displayAfterSwap(data);
            }
        }

        if (!swapped) {
            break;
        }
    }
  }

  public void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
        int key = data[i];
        int j = i - 1;
        boolean swapped = false;

        while (j >= 0 && data[j] > key) {
            data[j + 1] = data[j];
            j--;
            swapped = true;
        }

        if (swapped) {
            data[j + 1] = key;
            displayAfterSwap(data);
        }
    }
}

  private void displayAfterSwap(int[] data) {
      System.out.print("Current state: ");
      for (int value : data) {
          System.out.print(value + " ");
      }
      System.out.println();
  }
}
