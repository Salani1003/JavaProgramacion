package test;

import domain.*;

public class TestClaseObject {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 3000);
        Empleado empleado2 = new Empleado("juan", 3000);

        if (empleado1 == empleado2) {
            System.out.println("Igual referencia en memoria");
        } else {
            System.out.println("Distinta referencia en memoria");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Son iguales en contenido");
        } else {
            System.out.println("Son distintos en contenido");

        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hash es igual");
        }else
        {
            System.out.println("el valor hash es distinto");
        }
    }

}
