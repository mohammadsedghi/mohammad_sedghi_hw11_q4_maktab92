public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        Node<String> node = new Node();
        node.value = "a";
        Node<String> node1 = new Node();
        node1.value = "20";
        Node<String> node2 = new Node();
        node2.value = "30";
        myLinkedList.createLinkedList(node);
        myLinkedList.addNodeAtLast(node1);
        myLinkedList.addNodeAtLocation(node2,1);
        myLinkedList.traversLinkedList();
        System.out.println();
        System.out.println(myLinkedList.searchByValue("20"));
        System.out.println(myLinkedList.searchByIndex(2));
        myLinkedList.removeNodeByIndex(2);
        myLinkedList.traversLinkedList();
        System.out.println();
        myLinkedList.removeNodeByValue("a");
        myLinkedList.traversLinkedList();

    }
}