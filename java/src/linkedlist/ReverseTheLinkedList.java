package linkedlist;

public class ReverseTheLinkedList {

    public static void main(String[] args) {

        ListNode headNode = new ListNode(0);

        //Not a circular list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        headNode.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(null);

        System.out.println(headNode.toString());

        ListNode listNode = reverseLinkedList(headNode);

        System.out.println(listNode.toString());

    }

    private static ListNode reverseLinkedList(ListNode headNode){
        ListNode reversedNode = headNode;
        ListNode currentNode = headNode.getNextNode();
        reversedNode.setNextNode(null);
        while (currentNode!=null){
            ListNode temp = currentNode;
            currentNode = currentNode.getNextNode();
            temp.setNextNode(reversedNode);
            reversedNode = temp;
        }
        return reversedNode;
    }
}
