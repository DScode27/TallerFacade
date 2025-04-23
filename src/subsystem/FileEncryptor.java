package subsystem;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class FileEncryptor {


    public String encode(String texto){
        String textoEncoded = "";
        try {
            textoEncoded = new String(Base64.getEncoder().encode(texto.getBytes("UTF8")),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return textoEncoded;
    }

    public String decode(String texto){
        String textoDecoded = "";
        try {
            textoDecoded = new String(Base64.getDecoder().decode(texto.getBytes("UTF8")),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return textoDecoded;
    }
}
