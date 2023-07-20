/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo2;

/**
 *
 * @author omerb
 */
public class GrafoNoDirigido {
    private int numVertices;
    private int[][] matrizAdyacencia;

    public GrafoNoDirigido(int numVertices) {
        this.numVertices = numVertices;
        matrizAdyacencia = new int[numVertices][numVertices];
    }

    public void agregarArista(int origen, int destino) {
        matrizAdyacencia[origen][destino] = 1;
        matrizAdyacencia[destino][origen] = 1;
    }

    public int obtenerValorArista(int origen, int destino) {
        return matrizAdyacencia[origen][destino];
    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }
    
}
