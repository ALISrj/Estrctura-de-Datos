package listasdoblementeenlazada;

public class DoublyLinkedList {

    class Node {

        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public void insertAfterTail(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }

    }
    
    public void insertBeforeHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }

    }
    
    
    
    

    public void printHeadTail() {

        Node current = head;
        if(head == null){
            System.out.println("Lista vacía");
            return;
        }
        System.out.println("\nNodos de la lista doblemente enlazada de la cabeza a la cola:");
        while (current!=null) {
            System.out.print(current.data + "\t");
            current = current.next;
        }
    }
    
    public void printTailHead() {

        Node current = tail;
        if(head == null){
            System.out.println("Lista vacía");
            return;
        }
        System.out.println("\nNodos de la lista doblemente enlazada de la cola a la cabeza:");
        while (current!=null) {
            System.out.print(current.data + "\t");
            current = current.previous;
        }
    }

}
