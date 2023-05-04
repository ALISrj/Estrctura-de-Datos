/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglounidimensional;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Metodo {

    public static void insertar(int[] x) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingres el elemento de la posicion: " + i);
            x[i] = entrada.nextInt();
        }
    }

    public static void presentar(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i] + " \n");
        }
    }

    public static int busquedaSecuencial(int[] x, int num) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == num) {
                return i;
            }

        }
        return -1;
    }

    public static void eliminar(int[] x, int num) {
        int pos = busquedaSecuencial(x, num);

        for (int i = pos; i < x.length-1; i++) {
            x[i] = x[i + 1];
        }
        x[x.length - 1] = 0;

    }

}
