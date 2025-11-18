package controllers;

import models.Persona;

public class PersonaController {

    public void sortInserccion(Persona[] persona){
        int n = persona.length;
        for(int i=1; i<n;i++){
            int j = i-1;
            Persona key = persona[i];
            while (j >= 0 && key.getNombre().compareTo(persona[j].getNombre()) < 0) {
                persona[j+1] = persona[j];
                j--;

                
            }
            persona[j+1] = key;

        }
    }

    public void sortInserccionByAge(Persona[] persona){
        int n = persona.length;
        for(int i=1; i<n;i++){
            int j = i-1;
            Persona key = persona[i];
            while (j >= 0 && persona[j].getEdad() > key.getEdad()) {
                persona[j+1] = persona[j];
                j--;
            }
            persona[j+1] = key;
        }
    }

    public Persona busquedaBinariaByAge(Persona[] personas, int edadBuscada) {
        int bajo = 0;
        int alto = personas.length - 1;
        
        System.out.println("Busqueda Binaria por Edad");
        
        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();
            
            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getEdad());
                if (i < alto) System.out.print(" | ");
            }
            System.out.println();
            
            
            System.out.println("bajo=" + bajo + "    alto=" + alto + 
                              "    centro=" + centro + "    valorCentro=" + valorCentro);
            
            
            if (valorCentro == edadBuscada) {
                System.out.println(" -> Se encontro");
                
                int primera = centro;
                while (primera > 0 && personas[primera - 1].getEdad() == edadBuscada) {
                    primera--;
                }
                return personas[primera];
            } else if (valorCentro < edadBuscada) {
                System.out.println(" -> derecha");
                bajo = centro + 1;
            } else {
                System.out.println(" -> izquierda");
                alto = centro - 1;
            }
        }
        
        System.out.println(" -> No se encontro");
        return null;
    }
    public Persona busquedaBinaria(Persona[] persona, String nombreObjetivo){
        int izquierda = 0;
        int derecha = persona.length-1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha -izquierda)/2;
            if(persona[medio].getNombre().equals(nombreObjetivo)){
                return persona[medio];
            }
            if(persona[medio].getNombre().compareTo(nombreObjetivo) < 0){
                izquierda = medio + 1;
            }else{
                derecha = medio - 1;
            }
        }
        return null;   
    }
    public Integer binarySearchByName(Persona[] personas, String nombre) {
        int izquierda = 0;
        int derecha = personas.length - 1;
        while(izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = personas[medio].getNombre().compareTo(nombre);
            if(comparacion == 0) {
                return medio; // Nombre encontrado
            }else if(comparacion < 0) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            }else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }
        return null; // Nombre no encontrado
    }
    
}
