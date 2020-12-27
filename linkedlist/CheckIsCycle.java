package linkedlist;

public class CheckIsCycle {

    public static Integer hasCycle(SNode sNode) {
        SNode slow = sNode;
        SNode fast = sNode;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow.value;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SNode head = new SNode(0);
        SNode sNode = head;
        for (int i = 1; i < 10; i++) {
            head.next = new SNode(i);
            head = head.next;
        }
        head.next = sNode.next;
        System.out.println(hasCycle(sNode));
    }
}
