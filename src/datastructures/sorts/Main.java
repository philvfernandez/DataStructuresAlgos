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

        //Merge
        /* int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};
        MergeSort mergeSort = new MergeSort();

        System.out.println(Arrays.toString(mergeSort.merge(array1,array2))); */

        //MergeSort
       /* MergeSort myMergeSort = new MergeSort();
        int[] originalArray = {3,1,4,2};

        int[] sortedArray = myMergeSort.mergeSort(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray)); */

        //Quick Sort
        QuickSort quickSort = new QuickSort();
        int[] myArray2 = {4,6,1,7,3,2,5};
        int returnedInex = quickSort.pivot(myArray2, 0, 6);
        System.out.println("Returned Index: " + returnedInex);
        System.out.println(Arrays.toString(myArray2));
    }
}
