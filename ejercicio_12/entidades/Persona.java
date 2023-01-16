/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12.entidades;

import java.time.LocalDate;

/**
 *
 * @author Gisela Rantucho
 */
public class Persona {
    private String nombre;
    private LocalDate fechaNac;
    private long edad;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNac, long edad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", edad=" + edad + '}';
    }
            
}

