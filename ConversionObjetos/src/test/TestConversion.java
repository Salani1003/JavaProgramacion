package test;

import domain.*;

public class TestConversion {


    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Pablo", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        //Asigno una referencia de clase hija, a un objeto de tipo clase padre
        // a una variable de tipo Empleado, le asigno un tipo Escritor
        
        
        System.out.println("============================");
        
        System.out.println(empleado.obtenerDetalles()); 
        // Accedemos al metodo de la clase hija, gracias al polimorfirmo
        
        System.out.println("============================");
        ((Escritor) empleado).getTipoEscritura(); 
        //DOWNCASTING
        //para acceder a un metodo qeu solo esta definido en la clase hija, 
        //tengo que convertir la variable que cree  apuntando a la clase padre 
        // a una variable de tipo clase hija
        
        System.out.println("============================");
        //LO MISMO QUE ARRIBA PERO EN DOS LINEAS
        Escritor escritor = (Escritor) empleado; //CASTING
        escritor.getTipoEscritura(); 
        
        Empleado empleado2 = escritor; //UPCASTING
        //en el UPCASTING no es necesario hacer una conversion explicita. 
        // una variable del tipo padre puede apuntar a un variable de tipo hija sin problemas
        System.out.println("UPCASTING:"+ empleado2.obtenerDetalles());
       
    }
    
}
