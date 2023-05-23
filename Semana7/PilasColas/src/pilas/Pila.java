package pilas;

import java.util.Scanner;

public class Pila {

    int[] pila;
    int tope;
    int max;
    Scanner entrada = new Scanner(System.in);

    public Pila(int max) {
        tope = -1;
        this.max = max;
        pila = new int[this.max];
    }

    public int obtenerTope() {
        return this.tope;
    }

    public void vaciarPila() {
        this.tope = -1;
    }

    public boolean pilaLlena() {
        if (max - 1 == tope) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaVacia() {
        if (this.tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarPila() {
        if (pilaLlena()) {
            System.out.println("Pila LLena.");
        } else {
            int item;
            System.out.println("Ingrese el elemento a insertar.");
            item = entrada.nextInt();
            tope++;
            pila[tope] = item;
            System.out.println("El item " + item + " se ha insertado.");
        }
    }

    public void eliminarPila() {
        if (pilaVacia()) {
            System.out.println("Pila vacía.");
        } else {
            int item = pila[tope];
            tope--;
            System.out.println("El item" + item + " se ha eliminado.");
        }
    }

//    public void imprimirPila() {
//        if (pilaVacia()) {
//            System.out.println("Pila vacía, no hay datos para mostrar");
//        } else {
//            System.out.println("Lo datos de la pila son:");
//            for (int i = 0; i < max; i++) {
//                System.out.println(pila[i]);
//            }
//        }
//    }

    public void mostrarPila() {
        String mostrar = "";
        if (pilaVacia()) {
            System.out.println("Pila vacía");
        } else {
            
            for (int i = 0; i <= tope; i++) {
                mostrar = mostrar + pila[i] + "\n";
            }
            System.out.println("Lo datos de la pila son: \n" + mostrar);
        }
    }
}
