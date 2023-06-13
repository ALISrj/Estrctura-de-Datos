package listasenlazadas;


public class ListasEnlazadas {

    
    public static void main(String[] args) {
        
        ListaSimplementeEnlazada list = new ListaSimplementeEnlazada();
        
        list = list.insertar(list,3);
        list = list.insertar(list,8);
        list = list.insertar(list,1);
        list.print(list);
        
    }
    
}
