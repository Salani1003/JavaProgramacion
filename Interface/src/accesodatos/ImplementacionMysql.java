package accesodatos;

public class ImplementacionMysql implements IAccesoDatos {

        //implementes Interfaces para obligar a clases a implementar la interface

    
    @Override
    public void insertar() {
        System.out.println("Insertando en base de datos MySql.");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde base de datos MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando en base de datos MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando registros MySql");
    }
    
    
}
