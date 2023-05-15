package arreglosbidimensionales;

import java.util.Scanner;

public class Metodo {

    public static void print2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d   ", arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] leerMatriz() {

        int orden, i, j;
        Scanner in = null;
        try {

            in = new Scanner(System.in);
            System.out.println("Ingrese el orden de la matriz");
            orden = in.nextInt();
            int miMatriz[][] = new int[orden][orden];

            System.out.println("Ingrese elementos de la matriz:\n");
            for (i = 0; i < orden; i++) {
                for (j = 0; j < orden; j++) {
                    System.out.printf("Ingrese elemento[%d][%d]: ", i, j);
                    miMatriz[i][j] = in.nextInt();
                }
            }
            return miMatriz;

        } catch (Exception e) {
            System.out.println("ERRORR");
        } finally {
            in.close();
        }
        return null;
    }

    public static void numeroMayor(int[][] arr) {

        int fila = 0;
        int columna = 0;
        int mayor = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > mayor) {
                    mayor = arr[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.printf("El numero mayor es %d y esta en la posicion:"
                + " [%d][%d]",
                 mayor,
                 fila,
                 columna);
    }

}
