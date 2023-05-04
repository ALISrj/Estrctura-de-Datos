package arreglounidimensional;

import java.util.Scanner;

public class ArregloUnidimensional {

    public static void main(String[] args) {

//        Scanner entrada = new Scanner(System.in);
        int hola[] = new int[7];

//        for (int i = 0; i < hola.length; i++) {
//            System.out.println("Ingres el elemento de la posicion: " + i);
//            hola[i] = entrada.nextInt();
//        }
        Metodo.insertar(hola);
        Metodo.presentar(hola);
        System.out.println(Metodo.busquedaSecuencial(hola, 4));
        Metodo.eliminar(hola, 4);
        Metodo.presentar(hola);

    }

//    public static void insertar1(int[] x) {
//        Scanner entrada = new Scanner(System.in);
//        for (int i = 0; i < x.length; i++) {
//            System.out.println("Ingres el elemento de la posicion: " + i);
//            x[i] = entrada.nextInt();
//        }
//    }
//
//    public static void presentar1(int[] x) {
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(" " + x[i] + " \n");
//        }
    
}
