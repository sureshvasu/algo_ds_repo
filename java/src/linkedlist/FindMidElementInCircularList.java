package linkedlist;

import java.util.List;

public class FindMidElementInCircularList {

    public static void main(String[] args) {
        ListNode headNode = new ListNode(0);

        //Not a circular list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);


        //circular list
        headNode.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(headNode);

        System.out.println(findMidElement(headNode).getData());
    }

    public static ListNode findMidElement(ListNode headNode){
        ListNode fastPtr = headNode;
        ListNode slowPtr = headNode;
        while (fastPtr.getNextNode()!=headNode&&fastPtr.getNextNode().getNextNode()!=headNode){
            fastPtr = fastPtr.getNextNode().getNextNode();
            slowPtr = slowPtr.getNextNode();
        }
        return slowPtr;
    }


}
