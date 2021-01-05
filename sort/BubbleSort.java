package sort;

public class BubbleSort {
    public void sort(int[] array, int n) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    flag = false;
                }
            }
        }
    }
}
