package resolucion;

public class ListaSimplementeEnlazada {

    class Node {

        private int ticket;
        String cedula;
        Node next;

        Node(int d, String c) {

            ticket = d;
            cedula = c;
            next = null;

        }
        
        public int obtenerTicket(){
            return ticket;
        }

    }

    private Node head;

    public ListaSimplementeEnlazada insertar(ListaSimplementeEnlazada list, int data, String c) {

        Node newNode = new Node(data,c);
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
            System.out.println("Cola de Pacientes:\n");
            while (currentNode != null) {
                System.out.printf("- Ticket: [%d]\n\tCédula: %s\n",currentNode.ticket, currentNode.cedula);
                currentNode = currentNode.next;
        }
        System.out.println("\n");
    }
    
    public ListaSimplementeEnlazada delete(ListaSimplementeEnlazada list, int key){
    
        Node currentNode = list.head;
        Node prev = null;
        
        if (currentNode != null && currentNode.ticket == key) {
            list.head = currentNode.next;
            System.out.println("Ticket #" + key + " Atendido.\n");
            return list;
        }
        
        while (currentNode != null && currentNode.ticket != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        
        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println("Ticket #" + key + " Eliminado.\n");
        }
        
        if(currentNode == null){
            System.out.println("Ticket #" + key + " No encontrado.\n");
        }
        
        return list;
        
    }
    
    public Node obtenerCabeza(){
        return head;
    }
    
    public boolean listaVacia(){
        if (head == null){
            return true;
        }
        return false;
    }

}
