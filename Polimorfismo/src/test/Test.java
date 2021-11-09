package test;

import domain.*;

public class Test {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 6000);
        System.out.println("empleado1 = " + empleado1.obtenerDetalles());

        Gerente gerente1 = new Gerente("Carla", 10000, "sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        imprimir(gerente1);
        imprimir(empleado1);
    }

    public static void imprimir(Empleado empleado) {
        //un tipo padre puede apuntar a un objeto de tipo hijo
        String detalle = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalle);
        /*
        Dependiendo si empleado es de tipo EMPLEADO o tipo GERENTE 
        se va a ejecutar el obtenerDetalle() de la clase correspondiente
        eso es polimorfismo
         */

    }
}
