package Basics;

public class Code11_AddToNumbers {

    /**
     * 给定两个链表的头节点head1和head2，
     * 认为从左到右是某个数字从低位到高位，返回相加之后的链表
     * 例子     4 -> 3 -> 6        2 -> 5 -> 3
     * 返回     6 -> 8 -> 9
     * 解释     634 + 352 = 986
     */


    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static void addToNumbers(ListNode listNode1, ListNode listNode2) {
        
    }




    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        addToNumbers(listNode1, listNode2);
    }



}
