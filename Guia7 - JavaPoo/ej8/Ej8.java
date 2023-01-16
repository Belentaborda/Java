/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

/**
 *
 * @author Usuario
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseServicio Frase = new ClaseServicio();
        Cadena Cadena1 = Frase.CrearFrase();
        Frase.mostrarVocales(Cadena1);
        Frase.invertirFrase(Cadena1);
        Frase.invertirFrase(Cadena1);
        Frase.compararLongitud(Cadena1);
        Frase.unirFrases(Cadena1);
        Frase.reemplazar(Cadena1);
        Frase.contiene(Cadena1);
        
    }
    
}
