package paquete1;

public class Clase1 {
    
    public String attPublico = "valor atrib. publico";
    protected String attProtected= "valor atrib protegido";
    String pruebaDefault ="Hola mundo Default o package";
    int num;
    private String attPrivado = "valor Privado";
    
//    public  Clase1(){
//        System.out.println("Constructor publico");
//    }
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    public Clase1(String attPublico) {
        this.attPublico = attPublico;
        System.out.println("Constructor publico");
    }
//    Clase1(String prueba, int num){
//        this.pruebaDefault = prueba;
//        this.num = num;
//        System.out.println("Constructor Default o Package");
//    }
    
    public void metodoPublito(){
        System.out.println("Ejecuto metodo publico  ");
    }
    
    protected void metodoProtected(){
        System.out.println("Ejecuto metodo protected");
    }
    
    void metodoDefault(){
        System.out.println("Ejecuto metodo default");
    }
    
   // TODO LO QUE SEA PRIVADO SE VA A PODER ACCEDER SOLO DESDE LA CLASE DONDE FUE CREADO
}
