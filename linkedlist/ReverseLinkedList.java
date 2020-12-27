package linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        SNode head = new SNode(0);
        SNode sNode = head;
        for (int i = 1; i < 10; i++) {
            head.next = new SNode(i);
            head = head.next;
        }
        System.out.println(sNode);
        System.out.println(revert(sNode));
    }

    public static SNode revert(SNode sNode) {
        if (sNode == null){
            return null;
        }
        SNode head = null;
        SNode p = sNode;
        SNode cur;
        while (p != null) {
            cur = p.next;
            p.next = head;
            head = p;
//            res = head;
            p = cur;
        }
        return head;
    }
}

