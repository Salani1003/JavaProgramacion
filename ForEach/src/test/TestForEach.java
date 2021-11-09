package test;

import domain.Persona;

public class TestForEach {


    public static void main(String[] args) {
    
        int edades[]={5,6,8,7,9,11}; 
        
        for(int edad:edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[]= {new Persona("pablito")
                ,new Persona("Juan Roman"),new Persona("Alejandra")};
        
        for(Persona persona : personas){
            System.out.println("persona = " + persona);
        }
    }
    
    
    
}
