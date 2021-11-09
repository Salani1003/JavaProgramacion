package test;

public class TestArgVar {

    public static void main(String[] args) {
        
       imprimirNumero(3,5,6,7,8,11);
       imprimirNumero(1);
        variosParametros("pablito", 1,3,5,8);
    }
    
    private static void imprimirNumero(int ... numeros){
        //tipo de argumento y 3 puntos 
        //indico que puede variar la cantidad de argumentos que llegan
        //dentro de esta funcion, trato al argumento como un vector de argumentos.
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero = " + numeros[i]);
            
        }
    }
    
   private static void variosParametros(String nombre, int... numeros){
       //el argumento variable debe de ser el ultimo
       System.out.println("nombre = " + nombre);
       for (int i = 0; i < numeros.length; i++) {
       System.out.println("numeros = " + numeros[i]);    
       }
       
   }
}
