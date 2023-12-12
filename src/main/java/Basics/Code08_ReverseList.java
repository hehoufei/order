package Basics;

public class Code08_ReverseList {

    // 给定一个单链表的头head，完成链表的逆序调整

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        forLoop(node);
        Node reverseNode = reverseNode(node);
        System.out.println();
        forLoop(reverseNode);
    }

    private static void forLoop(Node reverseNode) {
        if (reverseNode != null) {
            System.out.print(reverseNode.value);
            while (reverseNode.next != null) {
                reverseNode = reverseNode.next;
                int value = reverseNode.value;
                System.out.print(value);
            }
        }
    }

    private static Node reverseNode(Node head) {
        Node pre = null;
        Node next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static class Node {
        public int value;
        public Node next;
        public Node(int data) {
            value = data;
        }
    }
}
