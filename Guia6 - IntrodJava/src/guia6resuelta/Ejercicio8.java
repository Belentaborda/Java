package Guia6;
import java.util.Scanner;

// Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
// usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
// pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
// Nota: investigar la función Lenght() en Java.

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabras;
        System.out.println("Solo puede introducir frases o palabras de 8 de largo");
        palabras = sc.nextLine();
        if (palabras.length() == 8)
            System.out.println("Correcto");
        else
        System.out.println("Incorrecto");
    sc.close();
}
}
