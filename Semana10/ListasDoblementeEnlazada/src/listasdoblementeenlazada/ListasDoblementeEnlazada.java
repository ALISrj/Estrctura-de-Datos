package listasdoblementeenlazada;

public class ListasDoblementeEnlazada {

    public static void main(String[] args) {
       
        DoublyLinkedList dlist = new DoublyLinkedList();
        
        dlist.insertAfterTail(1);
        dlist.insertAfterTail(2);
        dlist.insertAfterTail(3);
        dlist.insertAfterTail(4);

        System.out.println(dlist.head);
        System.out.println(dlist.head.next);
        System.out.println(dlist.head.next.next);
        System.out.println(dlist.tail);

        
        System.out.println("");
        
        System.out.println(dlist.tail);
        System.out.println(dlist.tail.previous);
        System.out.println(dlist.tail.previous.previous);
        System.out.println(dlist.head);

        System.out.println("");
        
        dlist.printHeadTail();
        
        dlist.delete(dlist, 3);
        
        dlist.printHeadTail();
        System.out.println("");
        
        System.out.println(dlist.head);
        System.out.println(dlist.head.next);
        System.out.println(dlist.tail);

        
        System.out.println("");
        
        System.out.println(dlist.tail);
        System.out.println(dlist.tail.previous);
        System.out.println(dlist.head);

    }
    
}
