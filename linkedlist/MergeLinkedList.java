package linkedlist;

public class MergeLinkedList {
    public static void main(String[] args) {
        SNode head1= new SNode(0);
        SNode head2= new SNode(0);
        SNode sNode1 = head1;
        SNode sNode2 = head2;
        for (int i = 1; i < 10; i += 2) {
            head1.next = new SNode(i);
            head1 = head1.next;
        }

        for (int i = 0; i < 10; i += 2) {
            head2.next = new SNode(i);
            head2 = head2.next;
        }
        System.out.println(sNode1.next);
        System.out.println(sNode2.next);
        System.out.println(mergeTwoLinkedList(sNode1.next,sNode2.next));
    }

    public static SNode mergeTwoLinkedList(SNode n1, SNode n2) {
        SNode cur1 = n1;
        SNode cur2 = n2;
        SNode p = new SNode(-1);
        SNode res = p;

        while (cur1 != null && cur2 != null) {
            if (cur1.value > cur2.value) {
                p.next = cur2;
                cur2 = cur2.next;
            } else if (cur1.value <= cur2.value) {
                p.next = cur1;
                cur1 = cur1.next;
            }
            p = p.next;
        }

        while (cur1 != null) {
            p.next = cur1;
            cur1 = cur1.next;
            p = p.next;
        }

        while (cur2 != null) {
            p.next = cur2;
            cur2 = cur2.next;
            p = p.next;
        }
        return res.next;
    }
}
