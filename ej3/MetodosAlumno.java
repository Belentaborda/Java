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
package Ejercicio3.Colecciones.Metodos;

import Ejercicio3.Colecciones.Entidades.Alumno;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gisela Rantucho
 */
public class MetodosAlumno {

    private ArrayList<Alumno> lista = new ArrayList();
    Scanner sc = new Scanner(System.in);
    DecimalFormat decimales = new DecimalFormat("###,###.##");

    public void datosAlumnos() {
        System.out.println("Ingrese el nombre del alumno");
        String nombre = sc.next();
        int nota;
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del alumno");
            nota = sc.nextInt();
            notas.add(nota);
        }
        crearAlumno(nombre, notas);
    }

    public void crearAlumno(String nombre, ArrayList<Integer> notas) {
        Alumno alumno1 = new Alumno();
        alumno1.setNombreAlumno(nombre);
        alumno1.setNotas(notas);
        agregarAlumnos(alumno1);
    }

    public void agregarAlumnos(Alumno alumno1) {
        lista.add(alumno1);

    }

    public void mostrarAlumnos(Alumno alumno1) {
        for (Alumno aux : lista) {
            System.out.println(aux);
        }
    }

    public void notaFinal() {
        System.out.println("A que alumno desea sacar el promedio?");
        String nombreAl = sc.next();
        boolean verif = false;

        for (Alumno aux1 : lista) {
            if (aux1.getNombreAlumno().equals(nombreAl)) {
                verif = true;
                double notaFinal = 0;
                for (int aux2 : aux1.getNotas()) {
                    notaFinal += aux2;
                }
                System.out.println("El promedio final de: " + nombreAl + " es de: " + decimales.format(notaFinal / 3));
            }
        }
        if (verif == false) {
            System.out.println("El alumno ingresado no se encuentra en la lista");
        }

    }
}
