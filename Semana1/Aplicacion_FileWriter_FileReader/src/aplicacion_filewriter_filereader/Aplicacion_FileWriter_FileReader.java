
package aplicacion_filewriter_filereader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicacion_FileWriter_FileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un archivo y asegurandonos de que ya existe
//        try{
//        
//            File fileExample = new File("C:\\Users\\Alexito\\Desktop\\UNIVERSIDAD ALEX\\Ciclo2\\Estructura de Datos\\Estrctura-de-Datos\\Semana1\\Aplicacion_FileWriter_FileReader\\archivos\\ejemplo1.txt");
//            
//            if (fileExample.createNewFile()){
//                System.out.println("Archivo Creado: " + fileExample.getName());
//            } else {
//                System.out.println("Ya existe");
//            }
//            
//        }catch (IOException e){
//            
//            System.out.println("Error " + e);
//        
//        }
//        
//        // Escribir un ARchivo con Write // El argumento TRUE despues de la ruta si es verdadero me permite aniadir informacion, sin este el archivo se sobreescribiria
//        try(FileWriter escritor = new FileWriter("C:\\Users\\Alexito\\Desktop\\UNIVERSIDAD ALEX\\Ciclo2\\Estructura de Datos\\Estrctura-de-Datos\\Semana1\\Aplicacion_FileWriter_FileReader\\archivos\\ejemplo1.txt",false)){
//        
//    
//            escritor.write("Escribiendo usando .write\n");
//            // .append me permite encadenar mas appends al final del sintaxis
//            escritor.append("Ejemplo usando append para aniadir con append\n").append("HOla Mundo\n");
//            
//            escritor.close();
//            System.out.println("Archivo escrito");
//            
//            
//        } catch(IOException e){
//            System.out.println("Error de escritura " + e);
//        }
//        
//        // Leer un archivo
//        System.out.println("Leyendo Archivo");
//        try(FileReader lector = new FileReader("C:\\Users\\Alexito\\Desktop\\UNIVERSIDAD ALEX\\Ciclo2\\Estructura de Datos\\Estrctura-de-Datos\\Semana1\\Aplicacion_FileWriter_FileReader\\archivos\\ejemplo1.txt")){
//        
//            int i;
//            while( (i = lector.read()) != -1){
//                
//                System.out.print((char)i);
//            }
//            
//        } catch (IOException e) {
//            
//            System.out.println("Error de letura " + e);
//        
//        }
        
        try{
            
            File file = new File("C:\\Users\\Alexito\\Desktop\\UNIVERSIDAD ALEX\\Ciclo2\\Estructura de Datos\\Estrctura-de-Datos\\Semana1\\Aplicacion_FileWriter_FileReader\\archivos\\example2.txt");

            if (file.createNewFile()) {
                
                System.out.println("Archivo creado: " + file.getName());
                
            } else{
                System.out.println("Archivo existente");
            }
            
        }catch (IOException e){
            System.out.println("Error " + e);
            
        }
        
        try(FileWriter escritor = new FileWriter("C:\\Users\\Alexito\\Desktop\\UNIVERSIDAD ALEX\\Ciclo2\\Estructura de Datos\\Estrctura-de-Datos\\Semana1\\Aplicacion_FileWriter_FileReader\\archivos\\example2.txt", false)){
            
            escritor.write("El futuro es hoy\n");
            escritor.append("SI que si\n").append("Oh si\n");
            escritor.close();
            
        }catch(IOException e){
            System.out.println("Error de escritura");
        }
        
        try(FileReader lector = new FileReader("C:\\Users\\Alexito\\Desktop\\UNIVERSIDAD ALEX\\Ciclo2\\Estructura de Datos\\Estrctura-de-Datos\\Semana1\\Aplicacion_FileWriter_FileReader\\archivos\\example2.txt")){
        
            int i;
            while( ( i = lector.read() ) != -1){
                System.out.print( (char)i );
            }
            
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        
        
        






    }
    
}
