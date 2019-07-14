package linkedlist;

public class ListNode {
    private int data;
    private ListNode nextNode;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode currentNode = this;
        while (currentNode!=null){
            stringBuilder.append(printNode(currentNode)+"->");
            currentNode = currentNode.getNextNode();
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }

    private String printNode(ListNode listNode) {
        if (listNode == null)
            return "null";
        else
            return "ListNode{" +
                "data=" + listNode.data +
                '}';
    }
}
