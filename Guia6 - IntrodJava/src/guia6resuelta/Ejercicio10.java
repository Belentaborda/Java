package Guia6;
import java.util.Scanner;

// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
// números al usuario hasta que la suma de los números introducidos supere el límite inicial.

public class Ejercicio10 {
    public static void main(String[] args) {
        int max, num, acum = 0;
        Scanner sc = new Scanner(System.in);

        do 
        {
        System.out.println("Ingrese un limite positivo: ");
        max = sc.nextInt();
        if (max<=0)
        System.out.println("El valor debe ser positivo");
        System.out.println("----------------------------");
        }while(max<=0);
        
        do
        {
            System.out.println("Ingrese un número a acumular: ");
            num = sc.nextInt();
            acum += num;
            System.out.println("Acumulación: " + acum);

        }while (acum<=max);

        System.out.println("Límite superado");
        System.out.println("TOTAL: " + acum);

        sc.close();
    }
    
}
