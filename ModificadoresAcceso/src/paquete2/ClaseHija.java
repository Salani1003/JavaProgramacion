package paquete2;

import paquete1.Clase1;

public class ClaseHija  extends Clase1{
    
    public ClaseHija(){
        super(); // para usar el constructor protected   
        this.attProtected = "Modificacion atributo protected";// hacer uso de atributo protegido
        this.metodoProtected();
    }
}
