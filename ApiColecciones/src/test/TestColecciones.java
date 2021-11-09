package test;

import java.util.*;

public class TestColecciones {


    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        
        //El tipo lista es ordenado y permite dublicar elementos.
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);
//        for(Object elemento :miLista){
//            System.out.println("elemento = " + elemento);
//        }
        
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        
        System.out.println("_____________________________________________________________________");
        
        //el tipo set no mantiene un orden y no permite duplicar elementos.
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        System.out.println("_____________________________________________________________________");
        
        Map miMap = new HashMap();
        
        miMap.put("Valor1", "Juan");
        miMap.put("Valor2", "Karla");
        miMap.put("Valor3", "Pablo");
        miMap.put("Valor4:", "Ale");
        
        String elemento = (String) miMap.get("Valor1");
        System.out.println("elemento = " + elemento);
        
        imprimir(miMap.keySet());
        imprimir(miMap.values());
        
    }
    
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento ->{
            System.out.println("elemento= "+ elemento);
        });
    }
}
