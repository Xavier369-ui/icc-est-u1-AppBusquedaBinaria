//import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Xavier Fajardo");
        //BusquedaBinaria bB = new BusquedaBinaria();
        /* 
        int[] arr = new int[]{10,2,4,8,7,8,13,20};
        bB.sortInserccion(arr);
        int result = bB.busquedaBinaria(arr, 10);
        sC.showResult(result, 10);
        pC.sortInserccion(people);
        //
        Integer pos = pC.binarySearchByName(people, "Pedro");
        sC.showPersonPosicion("Pedro", pos);
        Persona personResult = pC.busquedaBinaria(people, "Pedro");
        sC.showPersonResult(personResult, "Pedro");
        */

        Persona[] people = new Persona[]{
            new Persona("Pablo", 4),
            new Persona("María", 5),
            new Persona("Juan", 18),
            new Persona("David", 60),
            new Persona("Mateo", 25),
            new Persona("Diego", 12),
            new Persona("Ana", 8),
            new Persona("Alicia", 9),
            new Persona("Jaime", 40),
        };
        PersonaController pC = new PersonaController();
        ShowConsole sC = new ShowConsole();
        pC.sortInserccionByAge(people);
        sC.showArregloOrdenado(people);
        System.out.println();
        System.out.println("Buscar edad de 18");
        Persona result = pC.busquedaBinariaByAge(people, 18);
        sC.showPersonaPorEdad(result, 18);
        

        
        
       

        
    }
}
