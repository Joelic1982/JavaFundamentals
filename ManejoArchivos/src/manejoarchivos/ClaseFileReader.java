package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClaseFileReader {
    
    public void leerArchivo(){
        String path = "C:\\Users\\DCA\\Documents\\JavaFundamentals\\JavaFundamentals\\repositorio.txt";
        
        try (FileReader fr = new FileReader(new File(path))) {
            while (fr.ready()) {                
                char[] word = new char[200];
                fr.read(word);
                System.out.println(word);
            }
            fr.close();
            
        } catch (FileNotFoundException ffe) {
            ffe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
    
}
