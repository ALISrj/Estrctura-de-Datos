package listacirculardoble;

public class DoublyLinkedListC {

    public Node head = null;
    public Node tail = null;

    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
            head.previous = tail;
            tail.next = head;

        } else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = head;
            head.previous = tail;

        }

    }

    public void printHeadTail() {
        Node current = head;
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Nodos de la lista circular: \n");

            do {
                System.out.print(current.data + "\t");
                current = current.next;
            } while (current != head);

            System.out.println("");

        }

    }

    public void printTailHead() {

        Node current = tail;
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Nodos de la lista circular: \n");

            do {
                System.out.print(current.data + "\t");
                current = current.previous;
            } while (current != tail);

            System.out.println("");

        }

    }

}
