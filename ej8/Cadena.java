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
public class Cadena {

    @Override
    public String toString() {
        return "Cadena{" + "NuevaCadena=" + NuevaCadena + ", Longitud=" + Longitud + ", NuevaFrase=" + NuevaFrase + '}';
    }

  
     public String getNuevaCadena() {
        return NuevaCadena;
    }

    public void setNuevaCadena(String NuevaCadena) {
        this.NuevaCadena = NuevaCadena;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public Cadena(String NuevaCadena, int Longitud) {
        this.NuevaCadena = NuevaCadena;
        this.Longitud = Longitud;
    }

    public Cadena() {
    }
    
   private String NuevaCadena;
   private int Longitud;
   private String NuevaFrase;

    public String getNuevaFrase() {
        return NuevaFrase;
    }

    public void setNuevaFrase(String NuevaFrase) {
        this.NuevaFrase = NuevaFrase;
    }
   
}
