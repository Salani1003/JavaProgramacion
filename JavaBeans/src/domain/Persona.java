package domain;

import java.io.Serializable;

public class Persona implements Serializable {

/*
    PARA QUE UNA CLASE SE CONSIDERE UN JAVA BEANS DEBE TENER
    -UN CONSTRUCTOR VACIO
    -CADA ATRIBUTO DEBE DE SER PRIVADO CON GET Y SET
    -IMPLEMENTAR INTERFACE SERIALIZABLE
    */    
    private String nombre;
    private String apellido;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona {nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
