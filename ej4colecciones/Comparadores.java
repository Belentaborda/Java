/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4colecciones;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {
    public static Comparator<Pelicula> compDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) { // t2 es la pelicula de mayor duracion
           return t2.getDuracion().compareTo(t1.getDuracion()); 
    }        
    };
    
    public static Comparator<Pelicula> compAscendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) { // t1 es la pelicula de menor duracion
           return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };
     public static Comparator<Pelicula> tituloAscendente = new Comparator<Pelicula>(){
         @Override
         public int compare(Pelicula t1, Pelicula t2) { // t1 es la pelicula de menor duracion
           return t1.getTitulo().compareTo(t2.getTitulo()); 
     }
     };
     public static Comparator<Pelicula> directorAscendente = new Comparator<Pelicula>(){
         @Override
         public int compare(Pelicula t1, Pelicula t2) { // t1 es la pelicula de menor duracion
           return t1.getDirector().compareTo(t2.getDirector()); 
     }
     };
}
