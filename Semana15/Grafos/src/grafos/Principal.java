package grafos;
public class Principal {
    public static void main(String[] args) {
        
        GrafoNoDirigido grafo1 = new GrafoNoDirigido(6);
        
        grafo1.agregarArista(0, 1);
        grafo1.agregarArista(0, 2);
        grafo1.agregarArista(0, 3);
        grafo1.agregarArista(1, 3);
        grafo1.agregarArista(1, 4);
        grafo1.agregarArista(2, 4);
        grafo1.agregarArista(3, 5);
        grafo1.agregarArista(4, 5);
        
        grafo1.presentar();
        
    }  
}
