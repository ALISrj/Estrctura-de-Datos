/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Crear nodos
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        // Agregar nodos al grafo
        grafo.agregarNodo(nodoA);
        grafo.agregarNodo(nodoB);
        grafo.agregarNodo(nodoC);
        grafo.agregarNodo(nodoD);
        // Establecer conexiones
        nodoA.agregarConexion(nodoB);
        nodoA.agregarConexion(nodoC);
        nodoB.agregarConexion(nodoC);
        nodoC.agregarConexion(nodoD);

        // Imprimir nodos adyacentes
        Nodo nodoActual = nodoA;
        System.out.println("Nodos adyacentes a " + nodoActual.getNombre() + ":");
        for (Nodo adyacente : nodoActual.getAdyacentes()) {
            System.out.println(adyacente.getNombre());
        }
        System.out.println("Nodo del Grafo");
        dfs(nodoA, new HashSet<>());
    }

    public static void dfs(Nodo nodo, Set<Nodo> visitados) {
        System.out.println(nodo.getNombre());
        visitados.add(nodo);

        for (Nodo adyacente : nodo.getAdyacentes()) {
            if (!visitados.contains(adyacente)) {
                dfs(adyacente, visitados);
            }
        }
    }
}
