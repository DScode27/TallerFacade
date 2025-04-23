package client;

import facade.Facade;

public class Client {
    public static void main(String[] args) {
        String filePath = "test.txt";
        String originalContent = "¡Hola, patrón Facade en Java!";

        Facade facade = Facade.getInstance();

        System.out.println("ARCHIVO: " + filePath);
        facade.leerArchivo(filePath);
        System.out.println("CIFRANDO Y ESCRIBIENDO EN EL ARCHIVO...:");
        System.out.println("Texto original: " + originalContent);
        facade.encriptarTexto(filePath, originalContent);
        facade.leerArchivo(filePath);
        System.out.println("DECODIFICANDO TEXTO: ");
        facade.desencriptarTexto(filePath);
    }
}