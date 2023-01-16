package Guia6;
import java.util.Scanner;

// Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
// pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
// la función equals() en Java.

public class Ejercicio7 {

    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = sc.nextLine();

        if (Eureka(frase))
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");    
            
        sc.close();
        
    }

    public static boolean Eureka(String frase) {

        if (frase.equals("eureka"))
            return true;
        else
            return false;
    
}
}