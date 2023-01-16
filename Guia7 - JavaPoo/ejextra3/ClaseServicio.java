/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra3;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
    Raices calculos= new Raices();
    
    public void construiObjeto(){
        System.out.println("Ingrese el valor de a");
        calculos.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b");
        calculos.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c");
        calculos.setC(leer.nextDouble());
        
        
    }
    public double getDiscriminante(Raices calculos){
        double discriminante = (Math.pow(calculos.getB(), 2)-4*calculos.getA()*calculos.getC());
        return discriminante;
               
    }
    public boolean tieneRaices(Raices calculos){
        boolean soluciones=false;
        if(getDiscriminante(calculos)>0){
            soluciones=true;
       
        }
        return soluciones;
    }
    public boolean tieneRaiz(Raices calculos){
        boolean soluciones=false;
        if(getDiscriminante(calculos)==0){
            soluciones=true;
       
        }
        return soluciones;
    }
    public void obtenerRaices(Raices calculos){
        double raiz1, raiz2;
        if (tieneRaices(calculos)== true){
            raiz1 = -calculos.getB()+(Math.sqrt(getDiscriminante(calculos)))/2*calculos.getA();
            System.out.println("La raiz 1 es: " + raiz1);
            raiz2 = -calculos.getB()-(Math.sqrt(getDiscriminante(calculos)))/2*calculos.getA();
            System.out.println("La raiz 2 es: " + raiz2);
        } else {
            System.out.println("No tiene dos raíces");
        }

    }
    public void obtenerRaiz(Raices calculos) {
        double raiz3;
        if (tieneRaiz(calculos) == true) {
            raiz3 = -calculos.getB() / 2 * calculos.getA();
            System.out.println("La raiz es:" + raiz3);
        } else {
            System.out.println("No tiene raiz");
        }
    }
    public void calcular(Raices calculos){
        if (tieneRaices(calculos)==true){
            obtenerRaices(calculos);
        }else if (tieneRaiz(calculos)){
            obtenerRaiz(calculos);
        } else {
            System.out.println("El determinante es negativo y no tiene raices reales");
        }
    }

    public void MENU() {
        boolean salir = false;
        int opcion;

        do {
            System.out.println("Ingrese la operacion que quiere realizar");
            System.out.println("1 - Get Discriminante");
            System.out.println("2 - Tiene Raices");
            System.out.println("3 - Tiene Raiz");
            System.out.println("4 - Obtener raices");
            System.out.println("5 - Obtener raiz");
            System.out.println("6 - Calcular");
            System.out.println("7 - Salir");
            opcion = leer.nextInt();
            switch (opcion) {
              
                case 1:
                    System.out.println("El discriminante es: " + getDiscriminante(calculos));
                    break;
                case 2:
                    System.out.println(tieneRaices(calculos));
                    break;
                case 3:
                    System.out.println(tieneRaiz(calculos));
                    break;
                case 4:
                    obtenerRaices(calculos);
                    break;
                case 5:
                    obtenerRaiz(calculos);
                    break;
                case 6:
                    calcular(calculos);
                    break;
                case 7:
                    salir = true;
                    break;
            }

        } while (!salir);

    }

}
