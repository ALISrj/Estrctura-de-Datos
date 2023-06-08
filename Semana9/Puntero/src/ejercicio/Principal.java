package ejercicio;

import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantas personas quiere ingresar?");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        Persona[] personas = new Persona[opcion];
        
        for (int i = 0; i < personas.length; i++) {
            
            System.out.printf("Ingrese la identificacion de la %d Persona:\n",i+1);
            String id = entrada.nextLine();
            System.out.printf("Ingrese 1 para indicar que la persona es Estudiante\n"
                    + "Ingrese 2 para indicar que la persona es Administrativo\n"
                    + "Ingrese 3 para indicar que la persona es Docente\n"
                    + "Escoja cualquier otro valor para asignar por defecto Estudiante\n> ");
            String tipo = entrada.nextLine();
            
            if ("1".equals(tipo)) {
                tipo = "Estudiante";
            } else if ("2".equals(tipo)) {
                tipo = "Administrativo";
            } else if ("3".equals(tipo)) {
                tipo = "Docente";
            } else {
                tipo = "Estudiante";
            }
            
            personas[i] = new Persona(id, tipo);
            
        }
        
        System.out.println("\nConcatenando...");
        
        for (int i = 0; i < personas.length-1; i++) {
            personas[i].concatenarPersona(personas[i+1]);
        }
        System.out.println("\nMemorias de cada uno");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        System.out.println("\nResumen");
        for (int i = 0; i < personas.length; i++) {
            System.out.printf("%d %s\n",i+1,personas[i].imprimir());
        }
        
        
        
        
    }
    
}
