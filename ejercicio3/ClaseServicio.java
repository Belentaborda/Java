/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
    public ClaseOperacion crearOperacion(){ // creacion del metodo
        ClaseOperacion objeto = new ClaseOperacion(); //creacion del objeto
        System.out.println("Por favor ingrese el primer numero");
        objeto.setNum1(leer.nextInt()); // invoca desde la otra clase el numero uno y le da valor
        System.out.println("Por favor ingrese el segundo numero");
        objeto.setNum2(leer.nextInt()); // invoca desde la otra clase el numero uno y le da valor
        return objeto; // si no hay return no deuvelve los valores 
    }
    public void sumar(ClaseOperacion objeto){ // creacion metodo sumar
        int suma;
        suma = objeto.getNum1()+objeto.getNum2();
        System.out.println("La suma es:" + suma);
    }
    public void restar(ClaseOperacion objeto){ // creacion metodo resta
        int resta;
        resta = objeto.getNum1()-objeto.getNum2();
        System.out.println("La resta es: "+ resta);
    }
    public void multiplicar(ClaseOperacion objeto){
        if (objeto.getNum1()!=0 & objeto.getNum2()!=0 ){  // != significa diferente
         int multiplicar;
         multiplicar = objeto.getNum1()*objeto.getNum2();
            System.out.println("La multiplicacion es:" + multiplicar);
    } else{
            System.out.println("La multiplicacion por 0 es igual a 0");
        }
} 
    public void dividir(ClaseOperacion objeto){
        if (objeto.getNum1 ()!=0 & objeto.getNum2()!=0 ){ // != significa diferente
            double dividir;
            dividir = objeto.getNum1()*objeto.getNum2();
             System.out.println("La division es:" + dividir);
    } else if (objeto.getNum1() == 0){
            System.out.println("El resultado de la division es 0");
    } else {
            System.out.println("No se puede realizar la division entre 0");
    }
    
}
}
