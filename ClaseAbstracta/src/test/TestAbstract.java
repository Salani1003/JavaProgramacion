package test;


import domain.*;

public class TestAbstract {

    public static void main(String[] args) {
        
       // FiguraGeometrica figura = new FiguraGeometrica();
       // las clases abstractas no se pueden instanciar
    
       FiguraGeometrica figura = new Rectangulo("Rectangulo");
       figura.dibujar();
    }
}
