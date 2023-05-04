package paqueteuno;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PruebaParcial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

//      Creamos el archivo.
        try {

            File file = new File("C:\\Users\\SALA A\\Desktop\\Estrctura-de-Datos\\PruebaParcial\\pruebaParcial\\archivos\\historial.txt");

            if (file.createNewFile()) {

                System.out.println("Archivo creado: " + file.getName());

            } else {
                System.out.println("Archivo existente");
            }

        } catch (IOException e) {
            System.out.println("Error " + e);

        }
//      Preguntamos cuantos pacientes va a ingresar y empezamos a introducir la info

        System.out.println("¿Cuantos historiales médicos de pacientes desea guardar? | Ingrese un número entero");
        int nPacientes = sc.nextInt();
        sc.nextLine();
        String mensaje = String.format("Número Total de Pacientes ingresados ahora mismo: %d\n", nPacientes);

        try (FileWriter escritor = new FileWriter("C:\\Users\\SALA A\\Desktop\\Estrctura-de-Datos\\PruebaParcial\\pruebaParcial\\archivos\\historial.txt", true)) {

//      tambien declaramos las variables que se usaran.
            String cedula;
            String apellidos;
            String nombres;
            String anio;
            String mes;
            String dia;
            String fechaNacimiento;
            double estatura;
            double peso;
            String alergias;

//      empezamos el ciclo para introducir los pacientes requeridos.
            for (int i = 0; i < nPacientes; i++) {

                System.out.println("Ingrese el número de cédula del paciente: ");
                cedula = sc.nextLine();
                System.out.println("Ingrese los apellidos completos del paciente: ");
                apellidos = sc.nextLine();
                System.out.println("Ingrese los nombres completos del paciente: ");
                nombres = sc.nextLine();

                System.out.println("Ingrese el año de nacimiento del paciente: ");
                anio = sc.nextLine();
                System.out.println("Ingrese el mes de nacimiento del paciente: ");
                mes = sc.nextLine();
                System.out.println("Ingrese el día de nacimiento del paciente: ");
                dia = sc.nextLine();

                fechaNacimiento = String.format("%s-%s-%s", anio, mes, dia);

                System.out.println("Ingrese la estatura del paciente: ");
                estatura = sc.nextDouble();
                System.out.println("Ingrese el peso del paciente: ");
                peso = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese las alergias del paciente: ");
                alergias = sc.nextLine();

                mensaje = String.format("""   
                                        %sCédula de Identidad: %s
                                        Apellidos Completos: %s
                                        Nombres Completos: %s
                                        Fecha de Nacimiento: %s
                                        Estatura: %s
                                        Peso: %s
                                        Alergias: %s
                                        ----------------------------------------
                                        """,
                         mensaje,
                        cedula,
                        apellidos,
                        nombres,
                        fechaNacimiento,
                        estatura,
                        peso,
                        alergias);

            }
            escritor.write(mensaje);
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error de escritura");
        }

        try (FileReader lector = new FileReader("C:\\Users\\SALA A\\Desktop\\Estrctura-de-Datos\\PruebaParcial\\pruebaParcial\\archivos\\historial.txt")) {

            int i;
            while ((i = lector.read()) != -1) {
                System.out.print((char) i);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
