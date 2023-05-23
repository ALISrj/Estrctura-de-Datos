package pilas;

public class Principal {

    public static void main(String[] args) {
        
        Pila pila1 = new Pila(5);
        
        pila1.insertarPila();
        pila1.insertarPila();
        
//      mostamos la pila  
        pila1.mostrarPila();
        
        
//      eliminamos el ultimo valor en entrar, copiando el comportamiento de una pila.  
        pila1.eliminarPila();
        
        
        pila1.mostrarPila();
    }
    
}
