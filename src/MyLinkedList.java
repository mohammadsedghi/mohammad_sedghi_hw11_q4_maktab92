public class MyLinkedList<T> {


  private   Node<T> head;
  private   Node<T> tail;
   private int size = 0;

    public void createLinkedList(Node<T> node) {

        node.next = null;
        head = node;
        head.next = node;
        tail = node;
        size++;

    }

    public void addNodeAtLast(Node<T> node) {
        Node<T> tempNode;
        tempNode = head;
        if (head == null) {
            System.out.println("this list is empty");
            return;
        } else
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
        tempNode.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    public void addNodeAtLocation(Node<T> node, int location) {
        Node<T> tempNode;
        tempNode = head;
        if (head == null) {
            System.out.println("this list is empty");
            return;
        } else
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
        node.next = tempNode.next;
        tempNode.next = node;
        tail = node;
        size++;
    }

    public int searchByValue(T value) {
        Node tempNode;
        tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                if (tempNode.value == value) {
                    System.out.print("index is: ");
                    return i;
                }
                tempNode = tempNode.next;
            }
        }
        return -1;
    }

    public T searchByIndex(int index) {
        Node<T> tempNode;
        tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    System.out.print("value is: ");
                    return tempNode.value;
                }
                tempNode = tempNode.next;
            }
        }
        T t=null;
        return t ;
    }

    public void removeNodeByIndex(int index) {
        Node<T> tempNode;
        tempNode = head;
        if (head == null) System.out.println("this list is empty");
        else if (index > 0) {
            for (int i = 0; i < index - 1; i++) {

                tempNode = tempNode.next;
            }

            tempNode.next = tempNode.next.next;
            size--;

        }
        if (index == 0) {
            head = tempNode.next;
        }

    }

    public void removeNodeByValue(T value) {
        Node<T> tempNode;
        tempNode = head;
        if (head == null) System.out.println("this list is empty");
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                removeNodeByIndex(i);
               return;
            }
            tempNode = tempNode.next;
        }
    }

    public void traversLinkedList() {
        Node<T> tempNode;
        tempNode = head;
        if (head == null) {
            System.out.println("this list is empty");
        } else {
            for (int i = 0; i < size; i++) {
                if (tempNode != null) {
                    System.out.print(tempNode.value + " , ");
                }
                if (tempNode.next == null) {
                    return;
                }
                tempNode = tempNode.next;
            }
        }
    }
}
