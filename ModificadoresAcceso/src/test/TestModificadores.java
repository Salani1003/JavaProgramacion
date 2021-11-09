package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadores {

    public static void main(String[] args) {

//        Clase1 clase1 = new Clase1(); 
// no puedo acceder porque es protegido   
        Clase1 clase1 = new Clase1("dsafsadfgsdadg");
        System.out.println("clase1 = " + clase1.attPublico);
        clase1.metodoPublito();
        System.out.println("====================================");
        // no puedo acceder a los atributos y metodos protegicos solo pueden accederse desde clases hijas 
            
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }

}
