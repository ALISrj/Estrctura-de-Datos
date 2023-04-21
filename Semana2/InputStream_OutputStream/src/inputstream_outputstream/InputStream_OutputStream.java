
package inputstream_outputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream_OutputStream {

    
    public static void main(String[] args) {
       
        // Crear Archivo
        try {
        
            File file = new File("C:\\Users\\SALA A\\Desktop\\Estrctura-de-Datos\\Semana2\\InputStream_OutputStream\\archivo\\ejemplo2.txt");
            
            if (file.createNewFile()){
                System.out.println("Archivo Creado: " + file.getName());
            } else {
                System.out.println("Ya existe");
            }
            
            
        } catch (IOException e) {
        
            System.out.println("Error " + e);
            
        }
        
        // Escribir Archivo inputStream
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\SALA A\\Desktop\\Estrctura-de-Datos\\Semana2\\InputStream_OutputStream\\archivo\\ejemplo2.txt")){
            // EL NOMBRE fos SIGNFICA FILEOUTPUTSTREAM
            // Guardar mensaje en una variable
            String mensaje = "Ejemplo de escritura (output) con bytes\n";
            // Transformar el mensaje a una arreglo de bytes
            byte b[] = mensaje.getBytes();
            // Escribir
            fos.write(b);
            fos.close();
        } catch (IOException e){
            System.out.println("Error " + e);
        
        }
        
        try(FileInputStream fis = new FileInputStream("C:\\Users\\SALA A\\Desktop\\Estrctura-de-Datos\\Semana2\\InputStream_OutputStream\\archivo\\ejemplo2.txt")){
            // FIS signfica fileinputstream
            int i;
            
            while( (i = fis.read()) != -1){
                
                System.out.print((char)i);
            }
            
            
        } catch(IOException e) {
            System.out.println("Error de lectura " + e);
        }
        
        
        
        
        
        
        
        
        
     
    }
    
}
