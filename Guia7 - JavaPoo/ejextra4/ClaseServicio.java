/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
    NIF DNI1 = new NIF();
    
   public NIF crearNif(){
     
       System.out.println("Por favor ingrese su número de DNI");
       DNI1.setDNI(leer.nextLong());
       String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S","Q", "V", "U", "H", "L", "C", "K", "E"};
       long resto = DNI1.getDNI()%23;
       
       int posicion=(int)resto;
       System.out.println(posicion);
       DNI1.setLetra(vector[posicion]);
      
       return DNI1;
   }
   
   public void mostrar(NIF DNI1){
       System.out.println(DNI1.getDNI() + " - " + DNI1.getLetra().toUpperCase());
   }
}
