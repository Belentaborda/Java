package Guia6;
import java.util.Scanner;

// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
// pantalla.

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Su nombre es " + nombre);

        sc.close();

    }
    
}
