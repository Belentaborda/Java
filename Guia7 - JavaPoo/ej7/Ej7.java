/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

/**
 *
 * @author Usuario
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseServicio objeto = new ClaseServicio();
         int[] vectorIMC = new int[4];
        boolean[] vectorEdad = new boolean[4];
        int PesoBajo=0, PesoIdeal=0, PesoAlto=0, Mayor=0, Menor=0;
        int PorcentajePB,PorcentajePI,PorcentajePA,PorcentajeMayor,PorcentajeMenor; 
        
        Persona Persona1 = objeto.crearPersona();
        vectorIMC[0]= objeto.calcularIMC();
        vectorEdad[0]=objeto.esMayorDeEdad();
        
        Persona Persona2 = objeto.crearPersona();
       vectorIMC[1]= objeto.calcularIMC();
        vectorEdad[1]=objeto.esMayorDeEdad();
        
        Persona Persona3 = objeto.crearPersona();
        vectorIMC[2]= objeto.calcularIMC();
        vectorEdad[2]=objeto.esMayorDeEdad();
        
        Persona Persona4 = objeto.crearPersona();
        vectorIMC[3]= objeto.calcularIMC();
        vectorEdad[3]=objeto.esMayorDeEdad(); 
       
       for (int i = 0; i < 4; i++) {
           switch (vectorIMC[i]) {
               case -1:
                   PesoBajo++;
                   System.out.println(""+PesoBajo);
                   break;
               case 0:
                   PesoIdeal++;
                   System.out.println(""+PesoIdeal);
                   break;
               case 1:
                   PesoAlto++;
                   System.out.println(""+PesoAlto);
                   break;
           }
        } 
       
       for (int i = 0; i <4  ; i++) {
            if (vectorEdad[i]){
                Mayor++;
            }else{
                Menor++;
            }
        }
        PorcentajePB = (100 / 4) * PesoBajo;
        PorcentajePI = ( 100 / 4) * PesoIdeal;
        PorcentajePA = ( 100 / 4) * PesoAlto;
        PorcentajeMayor = (100 / 4) * Mayor;
        PorcentajeMenor = (100 / 4) * Menor;
        System.out.println("El porcentaje de personas de bajo peso es: " + PorcentajePB + "%");
        System.out.println("El porcentaje de personas de ideal peso es: " + PorcentajePI + "%");
        System.out.println("El porcentaje de personas de alto peso es: " + PorcentajePA + "%");
        System.out.println("El porcentaje de personas mayores de edad es : " + PorcentajeMayor + "%");
        System.out.println("El porcentaje de personas menores de edad es: " + PorcentajeMenor + "%");

    
    
            }
    
}
