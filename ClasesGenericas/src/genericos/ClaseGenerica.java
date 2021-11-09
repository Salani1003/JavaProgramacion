package genericos;

public class ClaseGenerica<T> {
    
    //T indica un tipo generico
    
    T objeto;
    
    public ClaseGenerica(T objet){
        this.objeto =objet;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo es  = " + this.objeto.getClass().getSimpleName() );
    }
    
}
