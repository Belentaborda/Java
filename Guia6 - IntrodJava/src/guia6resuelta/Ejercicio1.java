package Guia6;
// Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
// dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class Ejercicio1 {
    

    public static void main(String[] args) throws Exception {
        int n1, n2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        res = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + res);

        sc.close();

    }
}
