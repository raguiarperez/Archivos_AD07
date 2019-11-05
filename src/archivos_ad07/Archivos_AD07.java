
package archivos_ad07;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class Archivos_AD07 {
    
    public static void infoArchivo() throws IOException {
        
        File archivo;
        archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
       
        System.out.println("Nombre:"+"Products1.txt");
        System.out.println("PATH:"+archivo.getAbsolutePath());
        System.out.println("Permisos de lectura:"+ archivo.canRead());
        System.out.println("Permisos de escritura:"+ archivo.canWrite());
        System.out.println("LOngitud en bytes:"+ archivo.length());
    }
    
    public static void forzarLectura() throws IOException {
        File archivo;
        archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        
        archivo.setReadOnly();
    }
    
    public static void forzarEscritura() throws IOException {
        File archivo;
        archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        
        archivo.setWritable(true);
    }
    
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Archivos_AD07.infoArchivo();
        Archivos_AD07.forzarLectura();
        Archivos_AD07.forzarEscritura();
    }
    
    
}
