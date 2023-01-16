/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Usuario
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseServicio servicio = new ClaseServicio(); // Se crea un objeto nuevo para que entre toda la informacion de las otras clases creacion del objeto, 
        ClaseOperacion Objeto = servicio.crearOperacion(); //se llama lo que esta en la clase servicio
        //*se crea un objeto de cada clase. De la clase operacion se pasa el objeto con los parametros*//        
        servicio.sumar(Objeto);
        servicio.restar(Objeto);
        servicio.multiplicar(Objeto);
        servicio.dividir(Objeto);
    }
    
}
