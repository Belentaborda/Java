/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"}; // arreglo donde se cargan los meses
        String mesSecreto = meses[(int)Math.random()*12] ; // aleatorio para asignar un mes
       String mesUsuario;
       int cont=0;
      /* boolean salir = false; // booleano para recorre el FOR. Esta echo por si la persona pone una palabra fuera de los meses del año. Entonces lo recorre todo*/
        do { // do while principal
            do {
                cont=0;
                System.out.println("Intente adivinar el mes secreto:");
                mesUsuario = leer.next();
                for (int i = 0; i < 12; i++) {
                    if (mesUsuario != meses[i]) {
                       cont++;
                    } 
                } if(cont == 12) {
                    System.out.println("La palabra ingresas no es un mes");
                }
            } while (cont ==12); // solo sale de esto cuando la condicion se falsa y pasa el do while principal
        
            if (!mesSecreto.equals(mesUsuario)) {
                System.out.println("No has acertado");
            }
        } while (mesSecreto.equals(mesUsuario));
        System.out.println("Acertaste");

    }  
}
