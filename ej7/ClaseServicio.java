/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   Persona Persona1 = new Persona();
    
    public Persona crearPersona(){
        
        String opcion="";
        System.out.println("Ingrese su nombre:");
        Persona1.setNombre(leer.next());
        
        System.out.println("Ingrese su edad:");
        Persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo donde H: HOMBRE, M: MUJER, O: OTRO");
        opcion= leer.next();
        Persona1.setSexo(opcion);
        switch(opcion.toUpperCase()) {
            case "H":
                Persona1.setSexo(opcion);
                break;
            case "M":
                Persona1.setSexo(opcion);
                break;
            case "O":
                Persona1.setSexo(opcion);
                break;
            default: 
                System.out.println("Por favor ingrese una opcion valida"); 
                opcion= leer.next();
        }
        System.out.println("Ingrese su peso actual:");
        Persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura actual");
        Persona1.setAltura(leer.nextDouble());
        return Persona1;

    }
    public int calcularIMC(){
        double IMC;
     IMC= Persona1.getPeso()/(Math.pow(Persona1.getAltura(),2));
     
     if (IMC < 20 ){
         return -1;
     } else if (IMC>=20 && IMC<=25) {
         return 0;
     } else {
         return 1;
     }
    }
        /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    
    public boolean esMayorDeEdad(){
        boolean mayor=false;
        if (Persona1.getEdad()>=18){
            mayor=true;  
        }return mayor;
        }
        
        /* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.*/
    }

