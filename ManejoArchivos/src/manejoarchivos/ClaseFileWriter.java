package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClaseFileWriter {
    
    public void escribirArchivo(){
        String path = "C:\\Users\\DCA\\Documents\\JavaFundamentals\\JavaFundamentals\\repositorio.txt";
        
        try (FileWriter fw = new FileWriter(new File(path), true)) {
            fw.append("Fecha: 03/02/2018");
            fw.close();
            
        } catch (FileNotFoundException ffe) {
            ffe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
    
}
