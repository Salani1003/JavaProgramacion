package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeracion {
    
    public static void main(String[] args) {
        
        System.out.println("Dia 1 :" +Dias.LUNES);
        System.out.println("Dia 1 :" +Dias.MARTES);
        System.out.println("Dia 1 :" +Dias.MIERCOLES);
        System.out.println("Dia 1 :" +Dias.JUEVES);
        System.out.println("Dia 1 :" +Dias.VIERNES);
        
        indicarDia(Dias.MARTES);
        
        
        
        System.out.println("================================================");
        System.out.println("Primer continente = " + Continentes.AFRICA);
        System.out.println("Numero de paises=" + Continentes.AFRICA.getPaises());
    }
    
    public static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("PRIMER DIA ");
                break;
            case MARTES: 
                System.out.println("SEGUNDO DIA");
                break;
        }
    }
}
