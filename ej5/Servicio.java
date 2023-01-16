/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;
import javax.xml.transform.Source;


/**
 *
 * @author Usuario
 */
public class Servicio {
    double saldototal;
    Scanner leer = new Scanner(System.in);
    CuentaBancaria nuevacuenta  = new CuentaBancaria();
    public CuentaBancaria CrearCuenta(){
        String conver;
        do {
        System.out.println("Ingrese su Numero de cuenta");
        nuevacuenta.setCuenta(leer.nextInt());
        conver = Integer.toString(nuevacuenta.getCuenta()); //convierto a cadena para que lea 
         if (conver.length() >10 ){
             System.out.println("El numero de cuenta es incorrecto, por favor ingrese un numero valido");   
         }
  }    while(conver.length() >10 ); //sacamos la longitud
         
         System.out.println("Ingrese su DNI");
         nuevacuenta.setDNI(leer.nextInt());
         System.out.println("Ingrese su Saldo");
         nuevacuenta.setSaldoActual(leer.nextInt());
         return nuevacuenta;
         
    }
    
    public void menu(double saldototal){
        int opcion;
       do{
        System.out.println("Por favor, ingrese la accion que quiera realizar:");
        System.out.println("1 - Ingresar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Extraccion Rapida");
        System.out.println("4 - Consultar Saldo");
        System.out.println("5 - Consultar Datos");
        System.out.println("6 - Salir");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                ingreso();
                break;
            case 2:
                retiro(saldototal);
                break;
            case 3:
              extracionrapida();
                break;
            case 4:
                saldo();
                break;
            case 5:
                consultardato();
                break;                
        } 
       } while(opcion !=6);
    }        
    
    
    
    public void ingreso(){  // void significa vacio para que no retorne valor
        double saldototal;
        System.out.println("Por favor, ingrese la cantidad a depositar: ");
        nuevacuenta.setIngreso(leer.nextDouble());
        saldototal = nuevacuenta.getIngreso() + nuevacuenta.getSaldoActual();
      
    }
    public void retiro(double saldototal) {
        double retirototal;
        System.out.println("Por favor, ingrese la cantidad a retirar: ");
        nuevacuenta.setRetiro(leer.nextDouble());
        if (nuevacuenta.getRetiro() > saldototal) {
            System.out.println("No posee dinero suficiente en su cuenta");
        } else {
            retirototal = saldototal - nuevacuenta.getRetiro();
            System.out.println("Su saldo restante es de: " + retirototal);
        }
    }

    public void extracionrapida(){
        double dineroretiro;
        do {
            System.out.println("Ingrese el monto a retirar. Recuerde que solo puede retirar el 20% de su saldo actual");
            dineroretiro = leer.nextDouble();
            if (dineroretiro == (nuevacuenta.getSaldoActual() * 0.2)) {
                System.out.println("Recuerde que la cantidad a retirar debe ser menor al 20% de su saldo actual");
            }
        } while (dineroretiro > (nuevacuenta.getSaldoActual() * 0.20));
        dineroretiro = nuevacuenta.getSaldoActual() - dineroretiro;
        }

    public void saldo (){
        System.out.println("Su saldo actual es de: " + saldototal);
}


    public void consultardato(){
         System.out.println("Su numero de cuenta es " + nuevacuenta.getCuenta());
          System.out.println("Su DNI es" + nuevacuenta.getDNI());
           System.out.println("Su saldo actual es: " + saldototal);
    }
}

