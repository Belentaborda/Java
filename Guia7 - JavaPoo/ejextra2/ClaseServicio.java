/*Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.*/

 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
   Puntos p1 = new Puntos();
   
   public Puntos crearPuntos(){
       System.out.println("Por favor ingrese la posicion de x1");
       p1.setX1(leer.nextInt());
       System.out.println("Por favor ingrese la posicion de y1");
       p1.setY1(leer.nextInt());
       System.out.println("Por favor ingrese la posicion de x2");
       p1.setX2(leer.nextInt());
       System.out.println("Por favor ingrese la posicion de y2");
       p1.setY2(leer.nextInt());
    return p1;   
   }
   public void Distancia(){
       double distancia;
       distancia = Math.sqrt((Math.pow(p1.getX1()- p1.getX2(), 2))+ (Math.pow(p1.getY1()- p1.getY2(),2)));
       System.out.println("La distancia entre los puntos es de:" + distancia);
   } 
} 
