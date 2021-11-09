package test;

import accesodatos.*;

public class TestInterfaces {

    public static void main(String[] args) {

        IAccesoDatos datos = new ImplementacionMysql();

        imprimir(datos);
        
        System.out.println("======================================================================");
        datos = new ImplementacionMongoDB();
        imprimir(datos);
        
        

    
}
    public static void imprimir(IAccesoDatos datos){
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
    }
}
