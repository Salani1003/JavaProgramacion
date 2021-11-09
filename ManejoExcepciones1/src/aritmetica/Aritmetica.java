package aritmetica;

import exepciones.OperacionExcepcion;

public class Aritmetica {

    public static int division(int numerador, int denominador)
            throws OperacionExcepcion{
        //con THROWS despues de los parametros le estoy diciendo al metodo que puedo devolver excepciones.
        if (denominador == 0){
            throw new OperacionExcepcion("Division por 0 no puede ser posible");
            //THROW para crear un nuevo objeto Exepcion y devolverlo al llamado 
            
        }
        return numerador/denominador;
    }
}
