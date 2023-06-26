package listassimplementeenlazadas;

public class Principal {

    public static void main(String[] args) {

        ListaSimplementeEnlazada list = new ListaSimplementeEnlazada();

        list = list.insertar(list, 3);
        list = list.insertar(list, 8);
        list = list.insertar(list, 1);
        

        System.out.println(list.head);
        System.out.println(list.head.next);
        System.out.println(list.head.next.next);
        
        list.print(list);
        
        list = list.delete(list, 1);
        
        list.print(list);
        
        System.out.println(list.head);
        System.out.println(list.head.next);


        

    }

}
