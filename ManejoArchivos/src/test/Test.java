package test;

import static manejoArchivos.ManejoArchivos.*;

public class Test {

    public static void main(String[] args) {
       
        var nombreArchivo = "prueba.txt";
        String contenido = "Este es el contenido del archivo";
        
//        crearArchivo(nombreArchivo);
        
        escribirArchivo(nombreArchivo, contenido);
        anexarInformacion(nombreArchivo, contenido);
        anexarInformacion(nombreArchivo, "ADIOS PERROS-");
        
        System.out.println("_____________________________________");
        leerArchivo(nombreArchivo);
    }
    
}
