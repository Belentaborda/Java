/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {

    Scanner leer = new Scanner(System.in);
    Nesspreso cafetera = new Nesspreso();

    public Nesspreso CrearCafetera() {

        return cafetera;
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Por favor ingrese la accion a realizar: ");
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir taza");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar cafe");
            System.out.println("5-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    llenarCafetera();
                    break;
                case 2:
                    servirTaza();
                    break;
                case 3:
                    vaciarCafetera();
                    break;
                case 4:
                    agregarCafe();
                    break;
            }

        } while (opcion != 5);

    }

    public void llenarCafetera() {
        if (cafetera.getCantidadActual() != cafetera.getCapacidadMaxima()) {     
           cafetera.setCantidadActual(500);
            System.out.println("La cafetera se lleno con exito");
            System.out.println("");
        }else{
            System.out.println("La cafetera no se pudo llenar");
            System.out.println("");
        }
            
    }

    public void servirTaza() {
        double incompleta, calculo=0;
        
        System.out.println("Por favor, ingrese el tamaño de la taza en la cual va a servir el cafe");
        System.out.println("");
        cafetera.setTaza(leer.nextInt());
        
        if (cafetera.getCantidadActual() < cafetera.getTaza()) {
            incompleta = cafetera.getCantidadActual();
            System.out.println("La taza no pudo llenarse por completo, solo se alcanzo: " + incompleta);
            System.out.println("");
            cafetera.setCantidadActual(0);
        } else { 
            System.out.println("La taza se lleno por completo");
            System.out.println("");
            calculo=cafetera.getCantidadActual()-cafetera.getTaza();
            cafetera.setCantidadActual(calculo);
            System.out.println("La cantidad actual de la cafetera es:"+ calculo);
            System.out.println("");
            
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
        System.out.println("Listo! La cafetera esta vacía");
    }

    public void agregarCafe() {
        double agregar;
        System.out.println("Por favor, ingrese la cantidad de cafe que desea agregar");
        agregar = leer.nextDouble();
        agregar = cafetera.getCantidadActual() + agregar;

        if (agregar > cafetera.getCapacidadMaxima()) {
            System.out.println("No se puede agregar cafe deibo a que supera la capacidad maxima de la cafetera"); 
        } else {
            System.out.println("Se agrego correctamente el cafe");
            cafetera.setCantidadActual(agregar);
        }
    }
}
