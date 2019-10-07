package com.leet.code.medium;

/**
 * Created by lining on 2019/10/7.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.setNext(node12);
        node12.setNext(node13);

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node21.setNext(node22);
        node22.setNext(node23);

        ListNode node = solution(node11, node21);
        while (node != null) {
            System.out.println(node.getVal());
            node = node.getNext();
        }
    }

    public static ListNode solution(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }

        int value1 = 0;
        int size1 = 1;
        while (list1 != null) {
            value1 += size1 * list1.getVal();
            size1 *= 10;
            list1 = list1.getNext();
        }

        int value2 = 0;
        int size2 = 1;
        while (list2 != null) {
            value2 += size2 * list2.getVal();
            size2 *= 10;
            list2 = list2.getNext();
        }

        int sum = value1 + value2;
        ListNode headNode = new ListNode(sum % 10);
        ListNode currentNode = headNode;
        while(sum / 10 != 0) {
            sum /= 10;
            currentNode.setNext(new ListNode(sum % 10));
            currentNode = currentNode.getNext();
        }

        return headNode;
    }
}
