package test;

import static aritmetica.Aritmetica.division;
import exepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
//        try{
//        resultado =10/0;    
//        }catch (Exception e){
//            System.out.println("OCURRIO UN ERROR !!! ");
//            e.printStackTrace(System.out);
//            System.out.println("=====================");
//        }
//        
//        System.out.println("resultado = " + resultado);
        
        System.out.println("=========================================================================================================");
        
        try{
            resultado = division(10,0);
        }catch(OperacionExcepcion e){
            //PUEDE HABER MAS DE UN BLOQUE CATCH PERO HAY QUE IR DE LO MAS GENERAL A LO MAS ESPECIFICO
            System.out.println("OCURRIO UN ERROR DE TIPO OPERACION EXCEPCION");
            System.out.println("Mensaje: " +e.getMessage());
        }
        catch (Exception e){
            System.out.println("OCURRIO UN ERROR!!!");
//            e.printStackTrace(System.out);
            System.out.println("Mensaje: "+e.getMessage());
        }finally{
            System.out.println("Este bloque de codigo siempre se ejecuta, incluso si ocurre una excepcion");
        }
        
    }
    
}
