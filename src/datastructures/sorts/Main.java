package datastructures.sorts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};

        //Selection Sort test
        /* SelectSort mySelectionSort = new SelectSort();
        mySelectionSort.selectionSort(myArray); */

       /* InsertionSort myInsertionSort = new InsertionSort();
        myInsertionSort.insertionSort(myArray);


        System.out.println(Arrays.toString(myArray)); */

        //Merge sort
        int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};
        MergeSort mergeSort = new MergeSort();

        System.out.println(Arrays.toString(mergeSort.merge(array1,array2)));
    }
}
