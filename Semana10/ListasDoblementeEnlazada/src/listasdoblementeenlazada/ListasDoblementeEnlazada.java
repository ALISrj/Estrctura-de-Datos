package listasdoblementeenlazada;

public class ListasDoblementeEnlazada {

    public static void main(String[] args) {
       
        DoublyLinkedList dlist = new DoublyLinkedList();
        
        dlist.insertAfterTail(5);
        dlist.insertAfterTail(2);
        dlist.insertAfterTail(3);
        dlist.insertBeforeHead(14);
        dlist.insertBeforeHead(1);
        
        dlist.printHeadTail();
        dlist.printTailHead();
        
    }
    
}
