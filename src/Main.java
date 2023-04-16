public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        Node node = new Node();
        node.value = 10;
        Node node1 = new Node();
        node1.value = 20;
        Node node2 = new Node();
        node2.value = 30;
        myLinkedList.createLinkedList(node);
        myLinkedList.addNodeAtLast(node1);
        myLinkedList.addNodeAtLocation(node2,1);
        myLinkedList.traversLinkedList();
        System.out.println();
        System.out.println(myLinkedList.searchByValue(20));
        System.out.println(myLinkedList.searchByIndex(2));
        myLinkedList.removeNodeByIndex(2);
        myLinkedList.traversLinkedList();

    }
}