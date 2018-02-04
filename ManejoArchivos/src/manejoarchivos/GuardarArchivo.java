package manejoarchivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarArchivo {
    
    public void guardarArchivo() throws FileNotFoundException, IOException {
        String file = "E:\\Java Fundamentals\\Sesiones\\manejoArchivos\\index.txt";
        
        FileOutputStream fos = new FileOutputStream(file);
        
        fos.write(100);
        fos.close();
    }
    
    
}
