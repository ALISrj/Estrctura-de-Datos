/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omerb
 */
public class Grafo {
    private List<Nodo> nodos;

    public Grafo() {
        this.nodos = new ArrayList<>();
    }

    // Resto de métodos del grafo

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

}
