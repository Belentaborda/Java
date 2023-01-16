package Guia6;
// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
// en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = sc.nextLine();
        System.out.println("Frase en Mayusculas: " + frase.toUpperCase());
        System.out.println("Frase en Minusculas: " + frase.toLowerCase());
        sc.close();
    }
    
}
