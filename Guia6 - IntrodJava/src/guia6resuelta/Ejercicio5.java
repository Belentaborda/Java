package Guia6;
// Escribir un programa que lea un número entero por teclado y muestre por pantalla el
// doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = sc.nextDouble();
        System.out.println("El doble del numero es: " + Math.abs(num*2));
        System.out.println("El triple del número es: " + num*3);
        System.out.println("La raiz cuadrada del número es: " + Math.sqrt(num));
        sc.close();
    }
    
}
