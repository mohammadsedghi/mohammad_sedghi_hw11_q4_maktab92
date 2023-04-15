public class MyLinkedList{

    Node head;
    Node tail;

    public  void createLinkedList(Node node){

       if (head==null) System.out.println("this list is empty");
       else {
           node.next=null;
           head.next=node;
           tail=node;
           System.out.println();
       }

    }
    public void addNodeAtLast(Node node){
        Node tempNode;
        if (head==null) System.out.println("this list is empty");
        else if (head.next.next!=null) {
           tempNode= head.next;
           tempNode.next=node;
           node.next=null;
           tail=node;
            System.out.println();
        }
        }


}
