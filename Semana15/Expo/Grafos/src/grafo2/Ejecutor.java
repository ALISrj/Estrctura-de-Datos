/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo2;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    public static void main(String[] args) {
        int numVertices = 6;
        GrafoNoDirigido grafo = new GrafoNoDirigido(numVertices);

        // Agregar aristas al grafo
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(3, 5);

        // Obtener valor de una arista
        int origen = 2;
        System.out.println("Los nodos adyacentes de 2 son: ");
        for (int i = 0; i < numVertices; i++) {
            if (i!=origen&&grafo.obtenerValorArista(origen, i)==1) {
                System.out.println(i);
            }
        }
        System.out.println("Los nodos del Grafo");
        boolean[] visitados = new boolean[numVertices];
        dfs(grafo.getMatrizAdyacencia(), 0, visitados);
    }

    public static void dfs(int[][] grafo, int nodoActual, boolean[] visitados) {
        visitados[nodoActual] = true;
        System.out.println(nodoActual);

        for (int i = 0; i < grafo.length; i++) {
            if (grafo[nodoActual][i] == 1 && !visitados[i]) {
                dfs(grafo, i, visitados);
            }
        }
    }
}
