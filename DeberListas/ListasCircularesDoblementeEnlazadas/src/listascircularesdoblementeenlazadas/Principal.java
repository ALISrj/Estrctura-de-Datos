
package listascircularesdoblementeenlazadas;

public class Principal {
    
    public static void main(String[] args) {
        
        DoublyLinkedListC lista = new DoublyLinkedListC();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        
        System.out.println(lista.head);
        System.out.println(lista.head.next);
        System.out.println(lista.head.next.next);
        System.out.println(lista.tail);
        System.out.println(lista.tail.next);
        
        System.out.println("");
        
        System.out.println(lista.tail);
        System.out.println(lista.tail.previous);
        System.out.println(lista.tail.previous.previous);
        System.out.println(lista.head);
        System.out.println(lista.head.previous);
        
        lista.printHeadTail();
        lista = lista.delete(lista, 4);
        lista.printHeadTail();
        
        
        
        System.out.println(lista.head);
        System.out.println(lista.head.next);
        System.out.println(lista.tail);
        System.out.println(lista.tail.next);
        
        System.out.println("");
        
        System.out.println(lista.tail);
        System.out.println(lista.tail.previous);
        System.out.println(lista.head);
        System.out.println(lista.head.previous);
        
    }
    
}
