/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaprueba;
import java.util.Scanner;
/**
 *
 * @author jeron
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];               
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int)(Math.random()*10);
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println("");
        }
                System.out.println("------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int)(Math.random()*10);
                System.out.print("[" + matrizP[i][j] + "]");
            }
            System.out.println("");
        }
        comprobar(matrizM,matrizP);
    }
    public static void comprobar(int[][] matrizM,int[][] matrizP){
        System.out.println("-------------");
        int[][] matrizAux = new int[3][3];
        int cont,cord1,cord2;
        cont = 0;
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            cord1 = i;
            for (int j = 0; j < 10; j++) {
                cord2 = j;
                if (i < 7 && j < 7) { //esto es para que si o si la pos 0 de P quede separada por tres espacios del lado izquierdo de la pos de M, de esta manera se asegura que entra una matriz de 3x3 en la pos igualada, sino no sirve.
                    if (matrizP[0][0] == matrizM[i][j]) { //Acá se compara la posición 0 de matriz P con todas las pocisiones de matriz M
                        for (int k = 0; k < 3; k++) { //Si la posición 0 de P es igual a la pos X de M, entonces pasa a llenar la matriz auxiliar con las sig. coordenadas de P sobre M. 
                            for (int l = 0; l < 3; l++) {
                                matrizAux[k][l] = matrizM[cord1][cord2];//a partir de la coordenada 0, empieza a guardar las siguientes coordenadas de 3*3, es decir 9 coordenadas,
                                //en la matriz aux para que despues la compare con la matriz P , si toda la matriz P coincide con la aux entonces se cumple la condición.
                                cord2++;
                            }
                            cord2 = j;
                            cord1++;
                        } //Los contadores son para que estos for sigan ejecutando i="k",y no salten al siguiente for.
                        for (int z = 0; z < 3; z++) {
                            for (int x = 0; x < 3; x++) {
                                if (matrizAux[z][x] == matrizP[z][x]) { //Acá se compara que todas las coordenadas de la matriz aux de 3x3 sean iguales a P.
                                    cont++; //Si el contador llega a 9 se cumple la condición, es decir que las dos matrices de 3x3 son iguales.
                                }
                            }
                        }
                        if (cont == 9) {
                            flag = false;
                            System.out.println("La matrizP se encuentra en la matrizM desde la posiscion " + i + ":" + j);
                        }else{
                            cont = 0;
                        }
                    }

                }
            }
        if (i >= 9 && flag == true) {
            System.out.println("La matrizP no se encuentra dentro de la matrizM");
        }
        }  
    }
}
