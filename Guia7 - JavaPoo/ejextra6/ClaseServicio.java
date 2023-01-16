/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner (System.in);
    Ahorcado juego = new Ahorcado();
    
   public void crearJuego(){
       System.out.println("Por favor ingrese la palabra");
       String palabra = leer.next();
       String arreglo[]= new String[palabra.length()];
       int oportunidades = (int) Math.random()*5;
       System.out.println("La cantidad de oportunidades que tiene es de: " + oportunidades);
      
       for (int i = 0; i < palabra.length(); i++) {
           
       }
   }
    
}
