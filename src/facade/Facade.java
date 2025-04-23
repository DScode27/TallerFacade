package facade;

import subsystem.FileEncryptor;
import subsystem.FileReader;
import subsystem.FileWriter;

public class Facade {
    private static Facade instance;

    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileEncryptor fileEncryptor;

    public Facade(){
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.fileEncryptor = new FileEncryptor();
    }

    public static Facade getInstance(){
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void leerArchivo(String path){
        fileReader.leerArchivo(path);
    }

    public void escribirArchivo(String path, String texto){
        fileWriter.escribirArchivo(path, texto);
    }

    public void encriptarTexto(String path, String texto){
        String encryptedContent = fileEncryptor.encode(texto);
        escribirArchivo(path, encryptedContent);
    }

    public void desencriptarTexto(String path){
        String encryptedContent = fileReader.leerArchivo(path);
        System.out.println("Texto desencriptado: " + fileEncryptor.decode(encryptedContent));
    }

}
