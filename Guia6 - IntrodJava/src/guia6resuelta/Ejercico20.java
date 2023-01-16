/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaprueba;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercico20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("ingrese un numero entre 1 y 9");
                    matriz[i][j] = leer.nextInt();
                    int fila = i, colu = j;
                    System.out.println("filas " + i + " columnas " + j);

                    if (matriz[i][j] > 9 || matriz[i][j] < 1) {
                        System.out.println("Ingrese un numero valido");
                    }

                } while (matriz[i][j] > 9 || matriz[i][j] < 1);

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");

        }
     int f1=0,f2=0,f3=0,c1=0,c2=0,c3=0,d1=0,d2=0;
     
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 3; j++) {
        f1=f1+matriz[i][j];
            }
        }for (int i = 1; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
              f2=f2+matriz[i][j];  
            }
        }for (int i = 2; i <= 2; i++) {
            for (int j = 0; j < 3; j++) {
              f3=f3+matriz[i][j];  
            }
        } for (int j = 0; j <= 0; j++) {
            for (int i = 0; i < 3; i++) {
              c1=c1+matriz[i][j];  
            }
        }for (int j = 1; j <= 1; j++) {
            for (int i = 0; i < 3; i++) {
              c2=c2+matriz[i][j]; 
            }
        }for (int j = 2; j <= 2; j++) {
            for (int i = 0; i < 3; i++) {
              c3=c3+matriz[i][j]; 
            }
        } for (int i = 0; i < 3; i++) {
            d1=d1+matriz[i][i];
        } for (int i = 0; i < 3; i++) {
            d2=d2+matriz[i][2-i];
        }
        System.out.println("La suma de la fila 1 es :" +f1);
        System.out.println("La suma de la fila 2 es :" +f2);
        System.out.println("La suma de la fila 3 es :" +f3);
        System.out.println("La suma de la columna 1 es :" +c1);
        System.out.println("La suma de la columna 2 es :" +c2);
        System.out.println("La suma de la columna 3 es :" +c3);
        System.out.println("La suma de la diagonal 1 es :" +d1);
        System.out.println("La suma de la diagonal 2 es :" +d2);
        
       if (f1 == c1 && f2 == f1 && f3 == f1 && f1 == d1 && f1 == d2 && f1 == c1 && f1 == c2 && f1 == c3) {
            System.out.println("El cuadrado es magico");
        }else{
            System.out.println("El cuadrado no es magico");
        }

    }

}   
        
