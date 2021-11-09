package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 6000);
        Gerente gerente1 = new Gerente("Carla", 10000, "sistemas");

        determinarTipo(gerente1);
        determinarTipo(empleado1);

    }

    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            System.out.println("Tipo Gerente");
            // si me llega un Gerente, transformo al typo Empleado en un  typo Gerente para 
            //poder usar los metodos del tipo gerente
            // es la conversion al tipo que hacer referencia en memoria el objeto
            
            
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            
            
            
            ((Gerente) empleado).getDepartamento();// conversion one Liner
            
            
        } else {
            System.out.println("Tipo Empleado");
        }
        
        //tengo que preguntar desde los tipos mas especificos hasta los mas genericos 
        //gerente1 es tipo Gerente/Empleado y Objects
        // empleado1 es tipo Empleado y Object
    }
}
