package Guia6;
import java.util.Scanner;

// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
// Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).



public class Ejercicio4 {
    public static void main(String[] args) {
        int grados, gCentigrados;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de grados centígrados");
        grados = sc.nextInt();
        gCentigrados = 32 + (9 * grados / 5);
        System.out.println("Grados Fahrenheit: " + gCentigrados + "°");
        sc.close();

    }
}
