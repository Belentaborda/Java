/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class ejercicio19guiajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).int[][] matriz = new int[3][3];*/
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizt = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println("ingrese un numero");
                matriz[i][j] = leer.nextInt();

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz transpuesta: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                matrizt[j][i] = matriz[i][j];
                System.out.print("|" + matrizt[j][i] + "|");
            }
            System.out.println(" ");

        }

        int cont = n*n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == (-matrizt[i][j])) {

                    cont--;
                } else {
                    cont=n*n;
                }

            }
        }
        if (cont == 0) {
            System.out.println("La matriz es anti simetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

}


