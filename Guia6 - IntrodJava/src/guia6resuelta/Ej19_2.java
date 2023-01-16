/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía1;


import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Julian_Velasco
 */
public class Ej19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int matrizt[][] = new int[4][4];
        int matrizneg[][] = new int[4][4];

        for (int i=0; i<4; i++){
            System.out.println("Ingresa los datos de tu matriz, fila " + (i+1));
            for (int j=0; j<4; j++){
        matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println("Esta es la matriz original");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
        System.out.print(matriz[i][j] + " " +"\t");
            }
        System.out.println("");
        }
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
             matrizt[j][i]=(matriz[i][j]);
            }
        }
        System.out.println("A continuación, la matriz traspuesta");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
        System.out.print(matrizt[i][j] + " " +"\t");
            }
        System.out.println("");
        }
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
             matrizneg[i][j]=(-matriz[i][j]);
            }
        }
        System.out.println("A continuación, la matriz negativa");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
        System.out.print(matrizneg[i][j] + " " +"\t");
            }
        System.out.println("");
        }
        if (Arrays.deepEquals(matrizt, matrizneg))
           System.out.println("Es una Matriz Antisimétrica");
        else
           System.out.println("No es una Matriz Antisimétrica");
        
        System.out.println(" ");    
    }
    
}
