
package recursividad;

public class factorial {


    public static void main(String[] args) {
        int n = 5;
        int resultado = factorial(n);
        
        System.out.printf("El factorial de %d es %d", n, resultado);
       
    }
    
    public static int factorial(int n){
    
        if (n == 1) {
            
            return 1;
            
        } else {
        
            return n * factorial(n-1);
        
        }
    
    }
    
}
