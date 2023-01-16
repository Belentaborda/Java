/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

/**
 *
 * @author Usuario
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClaseServicio cafe = new ClaseServicio();
       Nesspreso cafetera=cafe.CrearCafetera(); 
       cafe.menu();
    }
    
}
