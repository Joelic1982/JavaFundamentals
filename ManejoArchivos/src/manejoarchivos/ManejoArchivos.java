package manejoarchivos;

public class ManejoArchivos {

    public static void main(String[] args) {
        ClaseFileReader fileReader = new ClaseFileReader();
        fileReader.leerArchivo();
        
        ClaseFileWriter fileWriter = new ClaseFileWriter();
        fileWriter.escribirArchivo();
    }
    
}
