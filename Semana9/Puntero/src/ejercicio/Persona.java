package ejercicio;

import nodos.Nodo;


public class Persona {
    
    private String identificacion;
    private String tipo;
    private Persona amigo;
    
    public Persona(String id, String t){
        identificacion = id;
        tipo = t;
    }
    
    public void concatenarPersona(Persona nodo) {
        amigo = nodo;
    }

    public String imprimir() {
        String mensaje = String.format("ID:" + identificacion + "\nTipo: "+ tipo +"\nAmigo: " + amigo+"\n");
        return mensaje;
    }
    
}
