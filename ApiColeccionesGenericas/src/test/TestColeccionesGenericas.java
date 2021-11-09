package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Hola");
        miLista.add("Juan");
        miLista.add("Carlos");
        miLista.add("como");
        miLista.add("estas");
        miLista.add("chupa");
        miLista.add("pija");
        imprimir(miLista);
        
        System.out.println("______________________________________________________________________");
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Hola");
        miSet.add("Juan");
        miSet.add("Carlos");
        miSet.add("como");
        miSet.add("estas");
        miSet.add("chupa");
        miSet.add("pija");
        imprimir(miSet);
       
        System.out.println("______________________________________________________________________");
        
        Map<String,String> miMap= new HashMap<>();
        miMap.put("Hola","Juan Carlos");
        miMap.put("Como","Estas");
        miMap.put("Chupa","Pija");
        miMap.put("Chupa","Verga");
        //en el map no se duplican llaves, se sustituye con el ultimo valor agregado
        
        String elementoMapa = miMap.get("Hola");
        
        System.out.println("elementoMapa = " + elementoMapa);
        System.out.println("______________________________________________________________________"); 
        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento ->{
            System.out.println("elemento= "+ elemento);
        });
    }
}
