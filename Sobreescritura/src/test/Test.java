package test;

import domain.Gerente;

public class Test {

    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Pablo",50000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
}
