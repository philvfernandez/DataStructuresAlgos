package datastructures.sorts;

public class InsertionSort {
    public void insertionSort(int[] arrray) {
        for(int i = 1;i < arrray.length;i++) {
            int temp = arrray[i];
            int j = i - 1;

            //order here counts!
            while(j > -1 && temp < arrray[j]) {
                arrray[j+1] = arrray[j];
                arrray[j] = temp;
                j--;
            }
        }
    }
}
