package test;

public class TestAutoboxingUnboxing {


    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos 
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean- Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        Integer entero = 10;
        System.out.println("entero = " + entero.doubleValue());//Autoboxing
        
        int entero2 = entero;//de entero se extrae la literal y se lo pone en una variable de tipo int
        System.out.println("entero2 = " + entero2);//Unboxing
    }
    
}
