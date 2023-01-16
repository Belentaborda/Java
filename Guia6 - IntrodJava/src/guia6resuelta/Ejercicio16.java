/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package EjerciciosJava;

import java.util.*;


public class Ejercicio16 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Defina un tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int buscado, i, cont = 0;
        for (i = 0; i < n - 1; i++){
            vector[i] = new Random().nextInt(n);
        }
        for (i = 0; i < n; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("Que numero quieres buscar?");
        buscado = leer.nextInt();
        for (i = 0; i < n; i++){
            if (vector[i] == buscado){
                cont++;
                System.out.println("El numero buscado " + buscado + " se encuentra en la posicion " + i);
            }
        }
        if (cont >= 1){
            System.out.println("El numero aparece " + cont + " veces");
        }else{
            System.out.println("El numero buscado no esta en el vector");
        }
       
    }
    
}
