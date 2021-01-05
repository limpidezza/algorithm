package sort;

public class InsertSort {
    public void sort(int[] array, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    int e = i;
                    while (e != j) {
                        array[e] = array[e - 1];
                        e--;
                    }
                    array[j] = tmp;
                    break;
                }
            }
        }
    }
}
