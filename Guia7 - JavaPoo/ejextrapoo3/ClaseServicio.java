/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrapoo3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
    Pass claves = new Pass();
    
    public Pass crearPass(){
        System.out.println("Por favor, ingrese su contraseña de 10 digitos "); 
        String contra = leer.next();
        do{
            
        if(claves.getPass().length()==10){
            System.out.println("Constraseña correcta. Puede continuar al menu");
            claves.setPass(contra);
            
        } else{
            System.out.println("Ingrese su contraseña nuevamente, recuerde que debe tener 10 digitos");
        }
        
        }while(contra.length()!= 10 );
        
        
        return claves;
        
    }
    public void analizarPass(){
        
        int cont =0;
        for (int i = 0; i < claves.getPass().length() ; i++) {
            if (claves.getPass().substring(i, i+1).equalsIgnoreCase("a") ){ // cuenta las A  
            cont ++;
        }
        }
        if(cont>= 2 && claves.getPass().toLowerCase().contains("z") ){
            System.out.println("El nivel de contraseña es ALTO");
        } else if (cont>= 2 && claves.getPass().toLowerCase().contains("z") ){
             System.out.println("El nivel de contraseña es MEDIO");
        } else {
        System.out.println("El nivel de contraseña es BAJO");
    }
       
    
            }
        
    
}
