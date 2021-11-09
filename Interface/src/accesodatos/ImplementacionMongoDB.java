package accesodatos;

public class ImplementacionMongoDB implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando en mongo");
    }

    @Override
    public void listar() {
        System.out.println("Listar en mongo");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar en mongo");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar en mongo");
    }

    
    
}
