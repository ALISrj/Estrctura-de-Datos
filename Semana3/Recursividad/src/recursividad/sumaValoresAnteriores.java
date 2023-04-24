package recursividad;

/**
 *
 * @author SALA I
 */
public class sumaValoresAnteriores {
    
    public static void main(String[] args) {
        int n = 2;
        int resultado = suma(n);
        
        System.out.printf("La suma de todos los valores anteriores de %d es %d", n, resultado);
       
    }
    
    public static int suma(int n){
    
        if (n == 1) {
            
            return 1;
            
        } else {
        
            return n + suma(n-1);
        
        }
    
    }
    
    
    
    
    
}
