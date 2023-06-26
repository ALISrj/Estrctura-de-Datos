package pruebaparcial12bim;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        DoublyLinkedList oracion = new DoublyLinkedList();

        boolean bandera = true;

        System.out.println("Bienvenido al gesto de Oraciones.\n");

        System.out.println("Comenzemos ingresando las palabras...");

        while (bandera) {
            System.out.print("\nIngrese una palabra.\n> ");
            String palabra = entrada.nextLine();
            oracion.insert(palabra);

            System.out.print("\n¿Desea parar de ingresar palabras? , ingrese 'si'.\n> ");
            String salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
        }

        bandera = true;

        while (bandera) {
            oracion.printHeadTail();
            System.out.printf("\n\nIngrese 1 para corregir una palabra.\n"
                    + "Ingrese 2 para borrar una palabra.\n"
                    + "Ingrese otro valor para salir.\n> ");
            String opcion = entrada.nextLine();

            if (opcion.equals("1")) {

                System.out.print("\nIngrese la palabra que quiere corregir.\n> ");
                String key = entrada.nextLine();
                oracion.corregir(oracion, key);
                
            } else if (opcion.equals("2")) {

                System.out.print("\nIngrese la palabra que quiere eliminar.\n> ");
                String key = entrada.nextLine();
                oracion.delete(oracion, key);
            } else {
                System.out.print("\nSaliendo...\n");
                bandera = false;
            }

            if (oracion.head == null) {
                System.out.println("\nOracion vacia saliendo...");
                bandera = false;
            }

        }

    }

}
