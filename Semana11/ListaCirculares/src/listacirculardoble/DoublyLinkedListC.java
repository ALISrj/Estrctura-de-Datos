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
    
    public DoublyLinkedListC delete(DoublyLinkedListC list, int key){
    
        Node currentNode = list.head;
        Node prev = null;
        
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            currentNode.next = null;
            list.tail.next = list.head;
            System.out.println(key + " found and deleted");
            return list;
        }
        
        while (currentNode != null && currentNode.data != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        
        if (currentNode != null && currentNode == list.tail) {
            list.tail = prev;
            tail.next = list.head;
            list.head.previous = list.tail;
            currentNode.next = null;
            currentNode.previous = null;
            return list;
        }
        
        
        if (currentNode != null) {
            prev.next = currentNode.next;
            currentNode.next.previous = prev;
            currentNode.next = null;
            currentNode.previous = null;
            System.out.println(key + " found and deleted");
        }
        
        if(currentNode == null){
            System.out.println(key + " not found");
        }
        
        return list;
        
    
    }

}
