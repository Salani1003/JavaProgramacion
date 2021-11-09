package domain;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;        
    }

    @Override
    public  String obtenerDetalles() {
        return super.obtenerDetalles()+ ", Departamento: "+this.departamento; //To change body of generated methods, choose Tools | Templates.
    // no pueden ser mas restrictivos los metodos sobreescritos
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
   
}
