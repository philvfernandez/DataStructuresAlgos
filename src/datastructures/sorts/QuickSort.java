package datastructures.sorts;

public class QuickSort {

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;

        for(int i = pivotIndex + 1;i<= endIndex;i++) {
            if(array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,pivotIndex,swapIndex);
        return swapIndex;
    }
}
