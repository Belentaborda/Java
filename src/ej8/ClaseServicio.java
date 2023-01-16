/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Cadena CrearFrase () {
       Cadena Cadena1 = new Cadena(); 
        System.out.println("Por favor, ingrese una frase");
        Cadena1.setNuevaCadena(leer.next());
        Cadena1.setLongitud(Cadena1.getNuevaCadena().length());
        return Cadena1;
    
}
    public int mostrarVocales(Cadena Cadena1 ){
        int cont=0;
        String vocal;
        for (int i = 0; i < Cadena1.getLongitud() ; i++) {
            vocal = Cadena1.getNuevaCadena().substring(i, i + 1 );
            switch (vocal){
                case "a":
                    cont++;
                            break;
                case "e":
                    cont++;
                            break;
                case "i":
                    cont++;
                    break;
                case "o":
                    cont++;
                    break;
                case "u":
                    cont++;
                    break;
               
            } 
        } 
         System.out.println("La cantidad de vocales es de:" + cont);
        return cont;
    }
    
    public String invertirFrase(Cadena Cadena1){
       String FraseInvertida="";
        for (int i= Cadena1.getLongitud() - 1 ; i >=0 ; i--) {
            FraseInvertida += Cadena1.getNuevaCadena().charAt(i);    
        }
      System.out.println("La frase invertida es: " + FraseInvertida);
      return FraseInvertida; 
    }
    
    public int vecesRepetida(Cadena Cadena1){
        int cont=0;
        String letra;
        System.out.println("Por favor ingrese la letra a buscar: ");
        letra= leer.next();
        for (int i = 0; i < Cadena1.getLongitud(); i++) {
            if (Cadena1.getNuevaCadena().substring(i, i+1).equalsIgnoreCase(letra)){
                cont++;
                
            }
        }
        System.out.println("La cantidas de veces que se repite " + letra + "es: " + cont);
        
        
        return cont;
    }
     public void compararLongitud(Cadena Cadena1){
         System.out.println("Por favor, ingrese una nueva frase:");
         Cadena1.setNuevaFrase(leer.next());
         if(Cadena1.getNuevaCadena().length()==Cadena1.getNuevaFrase().length()){
             System.out.println("Las frases tienen la misma longitud");
         }else {
             System.out.println("Las frases son de diferente longitud");
         }
     }
     public void unirFrases(Cadena Cadena1){
         System.out.println("Las frases unidas son: " + Cadena1.getNuevaCadena() + Cadena1.getNuevaFrase());
         
     }
     public String reemplazar(Cadena Cadena1){
         System.out.println("Por favor ingrese la letra por la que quiere reemplazar las letra A");
         String letra = leer.next();
         String CambioLetra = Cadena1.getNuevaCadena().replace("a", letra);
         System.out.println("La frase con las letras reemplazadas es: " + CambioLetra);   
         
         
         return CambioLetra;
     }
     public boolean contiene(Cadena Cadena1){
         System.out.println("Por favor, ingrese la letra que quiere buscar adentro de la frase:");
         String letra = leer.next();
         boolean Contiene = Cadena1.getNuevaCadena().contains(letra);
         System.out.println("El resultado de la búsqueda es:" + Contiene);   
         
         
         return Contiene;
         
     }
}
