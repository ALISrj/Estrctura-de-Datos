/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         GrafoDirigido grafo = new GrafoDirigido(10);

        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 0);

        List<Integer> adyacentes = grafo.obtenerAdyacentes(0);
        System.out.println("Nodos adyacentes al nodo 0:");
        for (Integer nodo : adyacentes) {
            System.out.println(nodo);
        }
        System.out.println("Nodos del Grafo");
         // Realizar el recorrido en anchura (BFS)
        bfs(grafo.getAdyacencia(), 0);
    }
     public static void bfs(List<List<Integer>> grafo, int nodoInicial) {
        boolean[] visitados = new boolean[grafo.size()];
        Queue<Integer> cola = new LinkedList<>();

        visitados[nodoInicial] = true;
        cola.offer(nodoInicial);

        while (!cola.isEmpty()) {
            int nodoActual = cola.poll();
            System.out.println(nodoActual);

            for (int adyacente : grafo.get(nodoActual)) {
                if (!visitados[adyacente]) {
                    visitados[adyacente] = true;
                    cola.offer(adyacente);
                }
            }
        }
    }
    
}
