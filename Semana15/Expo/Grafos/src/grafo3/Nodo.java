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
public class Nodo {
   private String nombre;
    private List<Nodo> adyacentes;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.adyacentes = new ArrayList<>();
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nodo> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(List<Nodo> adyacentes) {
        this.adyacentes = adyacentes;
    }
    
    public void agregarConexion(Nodo nodo) {
        adyacentes.add(nodo);
      // nodo.getAdyacentes().add(this);
    }
}
