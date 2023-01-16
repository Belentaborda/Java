/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra6;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
 
    public Ahorcado(String[] vector, int cantidadLetras, int intentos) {
        this.vector = vector;
        this.cantidadLetras = cantidadLetras;
        this.intentos = intentos;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public Ahorcado() {
        this.vector = new String[cantidadLetras];
    }
    private int cantidadLetras;
    private String vector[];
  
    private int intentos;
    
   
           


    }

