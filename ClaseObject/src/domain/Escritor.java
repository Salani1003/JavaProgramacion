package domain;

public class Escritor extends Empleado {
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipo){
        super(nombre,sueldo);
        this.tipoEscritura = tipo;
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+ "Tipo de Escritura:" +this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", Escritor{tipoEscritura=").append(tipoEscritura);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
