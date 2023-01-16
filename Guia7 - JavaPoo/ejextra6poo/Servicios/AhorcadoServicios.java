/*
  Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package Servicios;

import Entidades.JuegoAhorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AhorcadoServicios {

    Scanner leer = new Scanner(System.in);
    int encontradas = 0;
    JuegoAhorcado jAux = new JuegoAhorcado();
    
    public void crearJuego() {
        
        String palabra;
        
        System.out.println("Ingrese la palabra que el jugador debera adivinar");
        palabra = leer.nextLine();
        
        
        System.out.println("Usted tiene 7 intentos para adivinar");
        
        longitudPalabra(palabra);
        
        String[] vecAux = new String[palabra.length()];
        String[] vecAux2 = new String[palabra.length()];
        
        for (int i = 0; i < jAux.getCanLetras(); i++) {
            vecAux[i] = palabra.substring(i, i + 1);
            vecAux2[i] = "_";
        }
        jAux.setVecPalabra(vecAux);
        jAux.setPalEncontrada(vecAux2);
            
    }

    public void longitudPalabra(String palabra) {
        jAux.setCanLetras(palabra.length());
        System.out.println("La longitud de la palabra es de: " + jAux.getCanLetras() + " letras.");
    }
   
      
    
    public boolean buscar(String letra){
        
        for (String letra1: jAux.getVecPalabra()){
            if (letra1.equalsIgnoreCase(letra)) {
                
                System.out.println("Encontramos tu letra!");
                return true;
            }
        }
         System.out.println("Tu letra no se encuentra en esta palabra");   
        
        return false;
    }
    
    public void encontradas(String letra){
        int contEnc = 0;
       String[] vecAux = jAux.getPalEncontrada();
       int letraRep = 0;
        for (int i = 0; i < jAux.getCanLetras(); i++) {
            if (letra.equalsIgnoreCase(jAux.getPalEncontrada()[i])) {
                letraRep++;
            }
        }
       if(letraRep > 0){
            System.out.println("Boludo!! Ya pusiste esa letra, mirá bien!! Pelotudo..");
             jAux.setIntentos(jAux.getIntentos() - 1);
        }
        for (int i = 0; i < jAux.getCanLetras(); i++){
            
            if (jAux.getVecPalabra()[i].equalsIgnoreCase(letra)) {
               
                vecAux[i] = letra;
            }
            if (!vecAux[i].equalsIgnoreCase("_")) {
                contEnc ++;
            }
        }
        jAux.setPalEncontrada(vecAux);
        
        System.out.println("La cantidad de letras encontradas son: " + contEnc + ". Te faltan encontrar: " + (jAux.getCanLetras() - contEnc));
        System.out.println("Estas son tus letras adivinadas: " + Arrays.toString(vecAux));
    }
    
    public void intentos(boolean verificar, String letra){
        
        if (verificar == false) {
            jAux.setIntentos(jAux.getIntentos() - 1);
        }
        System.out.println("Le quedan: " + jAux.getIntentos() + " intentos!");
      
    }
    
    public void juego(){
        String letra;
        crearJuego();
        boolean verificar;
        boolean llenado = true;
        do{
            System.out.println("Ingrese una letra a adivinar");
            letra = leer.next();
            
            verificar = buscar(letra);
            
            encontradas(letra);
            
            intentos(verificar,letra);
            
            for (int i = 0; i < jAux.getCanLetras(); i++) {
                if (!jAux.getPalEncontrada()[i].equalsIgnoreCase("_")) {
                    llenado = false;
                }else{
                    llenado = true;
                    break;
                }
 
            }
            
        }while(jAux.getIntentos() != 0 && llenado);
        
        if (jAux.getIntentos() == 0)
            System.out.println("Has perdido!!");
        
        if (llenado == false)
            System.out.println("Adivinaste!!!");
    }
    
    
}
