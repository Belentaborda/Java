/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import ejercicio_12.entidades.Persona;
import ejercicio_12.servicios.Servicio;

/**
 *
 * @author Gisela Rantucho
 */
public class ejercicio_12_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio serv = new Servicio();
        Persona p1 = serv.crearPersona();
        serv.calcularEdad(p1);
        System.out.println("La persona es menor que el receptor: "+serv.menorQue(p1));
        serv.mostrarPersona(p1);
    }
    
}
