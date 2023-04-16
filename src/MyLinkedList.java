public class MyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    public void createLinkedList(Node node) {

        node.next = null;
        head = node;
         head.next=node;
        tail = node;
        size++;

    }

    public void addNodeAtLast(Node node) {
Node tempNode;
        tempNode=head;
        if (head == null) {
            System.out.println("this list is empty");
            return;
        } else
            for (int i = 0; i <size-1 ; i++) {
               tempNode=tempNode.next;
            }
         tempNode.next= node;
        node.next = null;
        tail = node;
        size++;
    }

    public void traversLinkedList() {
        Node tempNode;
        tempNode = head;
        if (head == null) {
            System.out.println("this list is empty");
        }
       else {
            for (int i = 0; i < size; i++) {
                if (tempNode != null) {
                    System.out.println(tempNode.value);
                }
                    tempNode = tempNode.next;
            }
        }
    }
}
