package controllers;

public class BusquedaBinaria {

    public void sortInserccion(int[] arr){
        int n = arr.length;
        for(int i=1; i<n;i++){
            int j = i-1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;

                
            }
            arr[j+1] = key;

        }
    }

    public Integer busquedaBinaria(int[] arr, int objetivo){
        int izquierda = 0;
        int derecha = arr.length-1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha -izquierda)/2;
            if(arr[medio] == objetivo){
                return arr[medio];
            }
            if(arr[medio] < objetivo){
                izquierda = medio + 1;
            }else{
                derecha = medio - 1;
            }
        }
        return -1;   
    }
    
}
