public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        Node<String> node = new Node();
        node.value = "a";
        Node<String> node1 = new Node();
        node1.value = "b";
        Node<String> node2 = new Node();
        node2.value = "c";
        myLinkedList.createLinkedList(node);
        myLinkedList.addNodeAtLast(node1);
        myLinkedList.addNodeAtLocation(node2,2);
        myLinkedList.traversLinkedList();
        System.out.println();
        System.out.println(myLinkedList.searchByValue("c"));
        System.out.println(myLinkedList.searchByIndex(2));
        myLinkedList.removeNodeByIndex(2);
        myLinkedList.traversLinkedList();
        System.out.println();
        myLinkedList.removeNodeByValue("a");
        myLinkedList.traversLinkedList();
        System.out.println();
        myLinkedList.removeNodeByValue("c");
        myLinkedList.traversLinkedList();

    }
}