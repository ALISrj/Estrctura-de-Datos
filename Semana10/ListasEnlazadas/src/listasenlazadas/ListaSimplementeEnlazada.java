package listasenlazadas;

public class ListaSimplementeEnlazada {

    class Node {

        int data;
        Node next;

        Node(int d) {

            data = d;
            next = null;

        }

    }

    Node head;

    public ListaSimplementeEnlazada insertar(ListaSimplementeEnlazada list, int data) {

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    
    public void print(ListaSimplementeEnlazada list){
        
            Node currentNode = list.head;
            System.out.println("Lista Enlazada:\n");
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
        }
        System.out.println("\n");
    }
    
    public ListaSimplementeEnlazada delete(ListaSimplementeEnlazada list, int key){
    
        Node currentNode = list.head;
        Node prev = null;
        
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }
        
        while (currentNode != null && currentNode.data != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        
        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }
        
        if(currentNode == null){
            System.out.println(key + " not found");
        }
        
        return list;
        
    }

}
