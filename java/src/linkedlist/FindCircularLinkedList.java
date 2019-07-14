package linkedlist;

/**
 * Find whether given linked list is circular or not
 */
public class FindCircularLinkedList {

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

        System.out.println("Is circular node --> " +isCircularList(headNode));

        //circular list
        headNode.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(headNode);

        System.out.println("Is circular node --> " +isCircularList(headNode));
    }

    private static boolean isCircularList(ListNode headNode){
        if(headNode != null){
            ListNode fastPtr = headNode, slowPtr = headNode;
            while (fastPtr!= null && slowPtr != null){
                fastPtr = fastPtr.getNextNode();
                if(fastPtr == slowPtr){
                    return true;
                }
                if (fastPtr == null){
                    return false;
                }
                fastPtr = fastPtr.getNextNode();
                if (fastPtr == slowPtr){
                    return true;
                }
                slowPtr = slowPtr.getNextNode();
            }
        }
        return false;
    }

}
