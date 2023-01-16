package Guia6;

import java.util.Scanner;

//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//        (void).
public class Ej14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int euros;
        System.out.println("Ingrese cantidad de euros");
        euros = leer.nextInt();
        ConvertirMoneda(leer, euros);
    }

    private static void ConvertirMoneda(Scanner leer, int euros) {
        String moneda;
        System.out.println("¿A que moneda quiere cambiar los euros?");
        System.out.println("dolar");
        System.out.println("yen");
        System.out.println("libra");
        moneda = leer.nextLine().toLowerCase();
        switch (moneda) {
            case "dolar":
                System.out.println(euros*1.28611 + " U$D");
            case "yen":
                System.out.println(euros*129.852 + " Yenes");
            case "libra":
                System.out.println(euros*0.86 + " libras");
        }
    }


}
