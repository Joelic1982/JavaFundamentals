package manejoarchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LeerArchivo {
    
    public void leerArchivo(){
        String file = "E:\\Java Fundamentals\\Sesiones\\manejoArchivos\\index.txt";
        
        try {
            InputStream fis = new FileInputStream(file);
            int b = fis.read();
            System.err.println(b);
            fis.close();
            
        } catch (FileNotFoundException ffe) {
            ffe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        
    }
    
}
