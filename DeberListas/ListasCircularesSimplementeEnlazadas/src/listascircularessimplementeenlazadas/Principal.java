package listascircularessimplementeenlazadas;

public class Principal {
    
    
    public static void main(String[] args) {
        
        SinglyLinkedListC lista = new SinglyLinkedListC();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        
        System.out.println(lista.head);
        System.out.println(lista.head.next);
        System.out.println(lista.head.next.next);
        System.out.println(lista.tail);
        System.out.println(lista.tail.next);
        
        lista.print();
        lista = lista.delete(lista, 4);
        lista.print();
        
        System.out.println(lista.head);
        System.out.println(lista.head.next);
        System.out.println(lista.tail);
        System.out.println(lista.tail.next);
    }
    
}
