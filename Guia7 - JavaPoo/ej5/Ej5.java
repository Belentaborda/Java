/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/**
 *
 * @author Usuario
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Servicio calculo = new Servicio();
      CuentaBancaria nuevacuenta = calculo.CrearCuenta(); // cuenta bancaria es la clase principal donde estan los atributos.. 
      //nuevecuenta es lo que retorna (return) de la primera clase de la clase Servicio ..
      // cualculo es el objeto que cree en la linea de arriba para que llame
      // CrearCuenta es el nombre que tiene la clase publica de la primer clase de la clase servicio.
      calculo.menu(0);

    }
    
}
