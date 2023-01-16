package Guia6;
import java.util.Scanner;

// Crear un programa que dado un numero determine si es par o impar.


public class Ejercicio6 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
        if(ParoImpar(num)){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        sc.close();
    }

    private static boolean ParoImpar(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }    
}
}
