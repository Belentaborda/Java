/*
 * 3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Ejercicio3.Colecciones;

import Ejercicio3.Colecciones.Entidades.Alumno;
import Ejercicio3.Colecciones.Metodos.MetodosAlumno;
import java.util.Scanner;

/**
 *
 * @author Gisela Rantucho
 */
public class Ejercicio3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosAlumno alumnos = new MetodosAlumno();
      Alumno alumno1 = null;//para traer los parametros de la clase servicio
       String opcion;
        do{
         alumnos.datosAlumnos();  
        System.out.println("Desea agregar otro alumno? s/n");
            do{
                opcion = sc.next();
                if (!"n".equalsIgnoreCase(opcion) && !"s".equalsIgnoreCase(opcion)){
                            System.out.println("Ingrese una opción Correcta");      
                }
            }while(!"n".equalsIgnoreCase(opcion) && !"s".equalsIgnoreCase(opcion));
            
        }while(opcion.equalsIgnoreCase("s"));
        alumnos.notaFinal();
        alumnos.mostrarAlumnos(alumno1);        
    }
    
}
