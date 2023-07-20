/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omerb
 */
public class GrafoDirigido {
    private int numNodos;
    private List<List<Integer>> adyacencia;

    public GrafoDirigido(int numNodos) {
        this.numNodos = numNodos;
        this.adyacencia = new ArrayList<>();

        for (int i = 0; i < numNodos; i++) {
            adyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino) {
        adyacencia.get(origen).add(destino);
        //adyacencia.get(destino).add(origen);//Agregamos esta linea se convierte en no dirigido
        
    }

    public List<List<Integer>> getAdyacencia() {
        return adyacencia;
    }

    public List<Integer> obtenerAdyacentes(int nodo) {
        return adyacencia.get(nodo);
    }
}
