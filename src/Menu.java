import java.util.Scanner;

public class Menu {
    public void showMenu() {
        System.out.println("menu 1:create linked list");
        System.out.println("menu 2:add node at last");
        System.out.println("menu 3:add node at location");
        System.out.println("menu 4:travers linked list");
        System.out.println("menu 5:search by value");
        System.out.println("menu 6:search by index");
        System.out.println("menu 7:remove by value");
        System.out.println("menu 8:remove by index");
        runProgram();
    }

    public void runProgram() {
        Scanner scanner = new Scanner(System.in);
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        Node<String> node = new Node();
        node.value = "a";
        Node<String> node1 = new Node();
        node1.value = "b";
        Node<String> node2 = new Node();
        node2.value = "c";
        while (true) {
            System.out.println("please inter number of menu :");
            System.out.println("==========================================");
            switch (scanner.nextInt()) {
                case 1:
                    myLinkedList.createLinkedList(node);
                    System.out.println("linked list is created");
                    break;
                case 2:
                    myLinkedList.addNodeAtLast(node1);
                    System.out.println("added at last");
                    break;
                case 3:
                    myLinkedList.addNodeAtLocation(node2, 2);
                    System.out.println("added at location");
                    break;
                case 4:
                    System.out.print("list is : ");
                    myLinkedList.traversLinkedList();
                    System.out.println();
                    System.out.println("==========================================");
                    break;
                case 5:
                    System.out.println(myLinkedList.searchByValue("d"));
                    System.out.println("==========================================");
                    break;
                case 6:
                    System.out.println(myLinkedList.searchByIndex(2));
                    System.out.println("==========================================");
                    break;
                case 7:
                    myLinkedList.removeNodeByValue("c");
                    System.out.println("==========================================");
                    break;
                case 8:
                    myLinkedList.removeNodeByIndex(1);
                    System.out.println("==========================================");
                    break;
            }
        }
    }
}
