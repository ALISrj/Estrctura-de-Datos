package recursividad;

public class palindroma {
        
    public static void main(String[] args) {
        
        String palabra = "patito";
        boolean resultado = palindroma(palabra);
        System.out.printf("La palabra %s , es palindroma? %s", palabra, resultado);
        
        
    }
    
    public static boolean palindroma(String palabra){
    
        if (palabra.length() == 0 || palabra.length() == 1) {
            return true;
        }
        if (palabra.charAt(0) == palabra.charAt(palabra.length()-1 )) {
            return palindroma(palabra.substring(1, palabra.length()-1 ));
        }
        return false;
    }
    
}
