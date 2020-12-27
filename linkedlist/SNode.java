package linkedlist;

public class SNode {
    SNode next;
    Integer value;

    public SNode(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ," + next;
    }
}
