package strings;

public class Strings {

    public static void main(String[] args) {
        
        String nombres = "Alex Israel ";
        String apellidos = "Ramírez Jiménez";
        String completo = nombres + apellidos;
        
        System.out.println(completo.length());
        
        String primerApellido = completo.substring(12,19);
        System.out.println(primerApellido);
        
        System.out.println(completo.indexOf("Jiménez"));
        
                    
        }
       
    }
    
