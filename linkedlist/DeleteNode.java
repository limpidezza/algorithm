package linkedlist;

public class DeleteNode {
    /**
     * 删除倒数第n个节点
     */
    public static SNode deleteNNode(SNode sNode, int n) {
        if (n <= 0) {
            return sNode;
        }
        SNode slow = new SNode(-1);
        slow.next = sNode;
        SNode res = slow;
        SNode fast = sNode;
        while (n > 0) {
            if (fast == null) {
                return sNode;
            }
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return res.next;
    }

    public static void main(String[] args) {
        SNode head = new SNode(0);
        SNode sNode = head;
        System.out.println(sNode);
        System.out.println(deleteNNode(sNode, 0));
    }
}
