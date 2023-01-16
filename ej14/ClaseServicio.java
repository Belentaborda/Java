/* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/



 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
   
     Movil Celular = new Movil();
    public Movil CargarCelular(){
        System.out.println("Ingrese la marca del celular");
        Celular.setMarca(leer.next());
        System.out.println("Ingrese el precio del celular");
        Celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo del celular");
        Celular.setModelo(leer.next());
        System.out.println("Ingrese la memoria RAM");
        Celular.setMemoriaRAM(leer.nextInt());
        System.out.println("Ingrese el almacenamiento");
        Celular.setAlmacenamiento(leer.nextInt());
        return Celular;
 
    } 
     public void ingresarCodigo(){

         int cod[] = new int [7];
         for (int i = 0; i < 7; i++) {
             System.out.println("Ingrese el codigo");
             cod[i] = leer.nextInt();
             
         } Celular.setCodigo(cod);
         System.out.println(Arrays.toString(cod));
     }
    
}
