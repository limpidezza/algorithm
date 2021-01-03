package queue;

import java.util.Arrays;

public class ArrayQueue {

    static int head;
    static int tail;
    static int n;
    String[] queue;

    public ArrayQueue(int capacity) {
        queue = new String[capacity];
        n = capacity;
    }

    public String deQueue() {
        if (tail == head) {
            return null;
        }
        String value = queue[head];
        head++;
        return value;
    }

    public boolean enQueue(String item) {
        if (tail == n) {
            if (head == 0) {
                return false;
            }
            for (int i = head; i < tail; i++) {
                queue[i - head] = queue[i];
            }
            tail -= head;
            head = 0;
        }
        queue[tail] = item;
        tail++;
        return true;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}
