package resolucion;

import java.util.Scanner;

public class Resolucion {

    public static void main(String[] args) {

        ListaSimplementeEnlazada colaPacientes = new ListaSimplementeEnlazada();

        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int numTicket = 1;
        System.out.println("\t\tBienvenido a Hospital UTPL");
        while (bandera) {

            System.out.print("\nIngrese 1 para ingresar paciente a la cola.\n"
                    + "Ingrese 2 para atender el paciente.\n"
                    + "Ingrese 3 para eliminar un paciente de la cola.\n"
                    + "Ingrese 4 para mostrar integrantes de la cola.\n"
                    + "Ingrese cualquier otro número para salir del programa.\n> ");
            String opcion = entrada.nextLine();

            if ("1".equals(opcion)) {
                System.out.print("\nIngrese la cédula del paciente.\n> ");
                String cedula = entrada.nextLine();
                colaPacientes = colaPacientes.insertar(colaPacientes, numTicket, cedula);
                System.out.printf("Se ha asignado el ticket #%d\n", numTicket);
                numTicket = numTicket + 1;
            } else if ("2".equals(opcion)) {
                if (colaPacientes.listaVacia()) {
                    System.out.println("\nNo existe ningún paciente en la fila.\n");
                } else {
                    colaPacientes = colaPacientes.delete(colaPacientes,
                            colaPacientes.obtenerCabeza().obtenerTicket());
                }

            } else if ("3".equals(opcion)) {
                if (colaPacientes.listaVacia()) {
                    System.out.println("\nNo existe ningún paciente en la fila.\n");
                } else {
                    System.out.print("\nQué número de ticket desea eliminar.\n> ");
                    int ticketEliminar = entrada.nextInt();
                    entrada.nextLine();
                    colaPacientes = colaPacientes.delete(colaPacientes, ticketEliminar);
                }
            } else if ("4".equals(opcion)) {
                if (colaPacientes.listaVacia()) {
                    System.out.println("\nNo existe ningún paciente en la fila.\n");
                } else {
                    colaPacientes.print(colaPacientes);
                }

            } else {

                bandera = false;

            }
        }
        System.out.println("\nSaliendo...\n");

    }

}
