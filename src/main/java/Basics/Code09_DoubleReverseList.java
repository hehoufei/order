package Basics;

public class Code09_DoubleReverseList {
    // 给定一个双链表的头head，完成链表的逆序调整

    public static class Node<V> {
        public V value;
        public Node<V> last;
        public Node<V> next;

        public Node(V v) {
            value = v;
            last = null;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node<String> node = new Node<String>("1");
        Node<String> stringNode = new Node<>("2");


    }
}
