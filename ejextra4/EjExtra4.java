/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra4;

/**
 *
 * @author Usuario
 */
public class EjExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseServicio NuevoDNI = new ClaseServicio();
        NIF DNI2= NuevoDNI.crearNif();
        NuevoDNI.mostrar(DNI2);
        
    }
    
}
