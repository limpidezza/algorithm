package sort;

import java.util.Arrays;

public class SelectSort {
    public void sort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
    }


    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        int[] arr = new int[]{2, 3, 8, 1, 4};
        int[] arr1 = new int[]{2, 3, 8, 1, 4};
        int[] arr2 = new int[]{2, 3, 8, 1, 4};
        selectSort.sort(arr, 5);
        bubbleSort.sort(arr1, 5);
        insertSort.sort(arr2, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
