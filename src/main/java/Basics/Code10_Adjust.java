package Basics;

import jdk.nashorn.internal.ir.IfNode;

public class Code10_Adjust {

    /**
     * 给定一个单链表的头节点head，和一个正数k
     * 实现k个节点的小组内部逆序，如果最后一组不够k个就不调整
     * 例子:
     * 调整前：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8，k = 3
     * 调整后：3 -> 2 -> 1 -> 6 -> 5 -> 4 -> 7 -> 8
     */
    public static void adjuest(ListNode<Integer> listNode, Integer K) {

        if (listNode == null) {
            return;
        }
        ListNode<Integer> end = getGroupEnd(listNode, K);

        reverse(listNode, end);

        while (end.next != null) {

        }
    }

    private static void reverse(ListNode<Integer> head, ListNode<Integer> end) {
        ListNode<Integer> pre = null;
        ListNode<Integer> next = null;
        while (head != null && head != end) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
    }

    private static ListNode<Integer> getGroupEnd(ListNode<Integer> listNode, Integer k) {
        ListNode<Integer> end = null;
        while (--k > 0 & listNode != null) {
            end = listNode.next;
        }
        return end;
    }

    public static class ListNode<T> {
        public int value;
        public ListNode<T> next;

        public ListNode(int data) {
            value = data;
        }
    }

    public static void main(String[] args) {
        ListNode<Integer> listNode = new ListNode<>(1);
        listNode.next = new ListNode<>(2);
    }

}
