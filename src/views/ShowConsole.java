package views;

import models.Persona;

public class ShowConsole {
    
    public void showResult(int resultado, int valorbuscado){
        if(resultado != -1){
            System.out.println("El valor " + valorbuscado + " fue encontrado.");
        }else{
            System.out.println("El valor " + valorbuscado + " no fue encontrado.");
        }

    }
    public void showPersonResult(Persona persona, String nombreBuscado){
        if(persona != null){
            System.out.println("La persona con nombre " + nombreBuscado + " fue encontrada: " + persona.toString());
        }else{
            System.out.println("La persona con nombre " + nombreBuscado + " no fue encontrada.");
        }
        
    }
    public void showPersonPosicion(String nombre, int posicion) {
        if (posicion != -1) {
            System.out.println(nombre + " fue encontrado en la posición: " + posicion);
        } else {
            System.out.println(nombre + " no fue encontrado");
        }
    }
    public void showPersonaPorEdad(Persona persona, int edadBuscada) {
        if (persona != null) {
            System.out.println("La persona con la edad " + edadBuscada + " es " + persona.getNombre());
        } else {
            System.out.println("No se encontro ninguna persona con edad " + edadBuscada);
        }
    }
    public void showArregloOrdenado(Persona[] personas) {
        System.out.print("Arreglo ordenado por edad: ");
        for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i].getEdad());
            if (i < personas.length - 1) System.out.print(" | ");
        }
        System.out.println();
    }
}
