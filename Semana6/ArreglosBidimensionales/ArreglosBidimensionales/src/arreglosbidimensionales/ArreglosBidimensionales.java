
package arreglosbidimensionales;

import static arreglosbidimensionales.Metodo.*;

public class ArreglosBidimensionales {

    public static void main(String[] args) {

        int[][] arreglo = {{1,2,3},{4,5,6}};
        print2D(arreglo);
        int[][] arreglo2 = leerMatriz();
        print2D(arreglo2);
        numeroMayor(arreglo2);
    }
    
}
