/*
12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior
 */
package ejercicio_12.servicios;

import ejercicio_12.entidades.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Gisela Rantucho
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();
        int dia, mes, anio;
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento: DD/MM/AAAA");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        LocalDate fechaN = LocalDate.of(anio, mes, dia);
        persona.setFechaNac(fechaN);
        return persona;
    }
    /*
    • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
    actual.
     */

    public void calcularEdad(Persona persona){
        long edad = ChronoUnit.YEARS.between(persona.getFechaNac(), LocalDate.now());
        persona.setEdad(edad);
        System.out.println("La edad de " + persona.getNombre()+ " es: "+edad);       
    }
    /*• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
    se recibe como parámetro, o false en caso contrario.
    */
    public boolean menorQue(Persona persona){
       // boolean menor=false;
        System.out.println("Ingrese la edad de la siguiente persona");
        long edad2=leer.nextLong();
        /*if(edad2<persona.getEdad()){
            menor=true;
        }*/
        return (edad2<persona.getEdad());//menor;
    }
    /*
    • Metodo mostrarPersona(): este método muestra la persona creada en el método 
    anterior
    */
    public void mostrarPersona(Persona persona){
        System.out.println(persona);
    }
    
}
