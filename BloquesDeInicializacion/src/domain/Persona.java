package domain;

public class Persona {

    // los bloques se mandan a llamar antes de los contructores
    
    private final int idPersona;
    private static int contadorPersona;
    
    static{
        //bloque de codigo de inicializacion estatico
        // se ejecuta cuando se carga esta clase en memoria
        System.out.println("Ejecucion bloque statico");
        //idPersona=10; no puedo llamar a una variable no estatica en un bloque estatico
        ++Persona.contadorPersona;
        //el bloque estatico de ejecuta solo una vez al cargar la clase
    }
    
    {
        //bloque de inicializacion no estatico
        //se ejecuta despues del bloque estatico pero antes del constructor
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona=Persona.contadorPersona++;
        
        //este bloque se ejecuta cada vez que se crea un objeto
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
        
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
}
