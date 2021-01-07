package sort;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] array, int n) {
        q_sort(array, 0, n);
    }

    public void q_sort(int[] array, int p, int q) {
        if (p >= q) {
            return;
        }
        int i = partition(array, p, q);
        q_sort(array, p, i);
        q_sort(array, i + 1, q);
    }

    public int partition(int[] array, int p, int q) {
        int pivot = array[q - 1];
        int i = p;
        for (int j = p; j < q - 1; j++) {
            if (array[j] < pivot) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
            }
        }
        array[q - 1] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] arr = new int[]{2, 3, 8, 1, 4};
        q.sort(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
