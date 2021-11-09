package test;

import domain.Persona;

public class TestBean {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Pablo");
        persona.setApellido("Salani");
        
        System.out.println("persona = " + persona);
    }
}
