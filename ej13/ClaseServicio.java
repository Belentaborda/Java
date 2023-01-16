/* método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/

 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner (System.in);
    Curso c1 = new Curso();
    String vector [] = new String [5];
    /* /* método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.*/
    
    public Curso cargarAlumnos(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor ingrese los alumnos");
            vector [i] = leer.next();
    
        } c1.setAlumnos(vector);
        return c1;
    }
    /* Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos*/ 
    
    public void crearCurso() {
    cargarAlumnos();
        System.out.println("Ingrese la cantidad de horas por dia: " );
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno: M o T");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora:");
        c1.setPrecioPorHora(leer.nextDouble());
}
    
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
    public void CalcularGananciaSemamal(){
        double precio;
        precio = c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getCantidadDiasPorSemana()*5;
        System.out.println("La ganancia semana es de $: " + precio );
    }
}

