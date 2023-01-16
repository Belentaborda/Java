/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6resuelta;

/**
 *
 * @author Usuario
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] vector = new int[100];
        int i;
        
        for ( i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        for ( i = vector.length - 1 ; i >= 0; i--) {
            //System.out.print("[" + vector[i] + "]" );
            if (i == 0) {
                System.out.print(vector[i] + "]");
            } else if (i == vector.length - 1) {
                System.out.print("[" + vector[i] + ", ");
            } else {
                System.out.print(vector[i] + ", ");
            }

            
        }
        System.out.println("");
      
        
    }
    
}