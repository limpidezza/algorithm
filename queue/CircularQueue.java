package queue;

public class CircularQueue {

    String[] queue;
    int n;
    int head;
    int tail;

    public CircularQueue(int capacity) {
        queue = new String[capacity];
        n = capacity;
    }

    public String deQueue() {
        if (tail == head) {
            return null;
        }

        String value = queue[head];
        head = (head + 1) % n;
        return value;
    }

    public boolean enQueue(String item) {
        if ((tail + 1) % n == head) {
            return false;
        }
        queue[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }
}
