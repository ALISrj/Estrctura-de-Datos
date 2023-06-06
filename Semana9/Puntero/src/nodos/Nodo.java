package nodos;

public class Nodo {

    int dato;
    Nodo next;

    public Nodo() {
        dato = 0;
        next = null;
    }

    public Nodo(int a) {
        dato = a;
        next = null;
    }

    public void concatenarMemoria(Nodo nod) {
        next = nod;
    }

    public void imprimir() {
        System.out.println("Dato:" + dato + "\nNext:" + next+"\n");
    }
}
