package datastructures.sorts;

public class BubbleSort {

    public void bubbleSort(int[] array) {
        for(int i = array.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] array) {
        for(int i = 0;i<array.length;i++) {
            int minIndex = i;
            for(int j = i+1;j < array.length;j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
