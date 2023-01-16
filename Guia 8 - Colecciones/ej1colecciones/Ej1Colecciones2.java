/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ej1colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Usuario
 */
public class Ej1Colecciones {

    /**
     * @param args the command line arguments
     */
    Scanner leer = new Scanner(System.in);
    ArrayList<String> perros = new ArrayList();
    Iterator<String> it = perros.iterator();

    public static void main(String[] args) {
        Ej1Colecciones perro = new Ej1Colecciones();
        perro.llenarRaza();
        perro.eliminarPerro();
    }

    public void llenarRaza() {
        String raza;
        String opcion;
        do {
            System.out.println("Por favor, ingrese la raza de su perro:");
            raza = (leer.next());
            perros.add(raza);
            System.out.println("Desea agregar otra raza ? S/N");

            do {
                opcion = leer.next();
                if (!"N".equalsIgnoreCase(opcion) && !"S".equalsIgnoreCase(opcion)) {
                    System.out.println("Por favor, ingrese una opcion correcta: S / N");
                }
            } while (!"N".equalsIgnoreCase(opcion) && !"S".equalsIgnoreCase(opcion));

        } while (opcion.equalsIgnoreCase("S"));
        System.out.println("La/s raza/s ingresadas son: ");
        for (String aux : perros) { //Campo aux donde almacena como va llenando

            System.out.println(aux);

        }

    }

    /* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
    public void eliminarPerro() {
        System.out.println("Ingrese la raza que desea eliminar");
        String raza = leer.next();

        if (perros.contains(raza)) {
            perros.remove(raza);
        } else {
            System.out.println("La raza ingresada no esta en la lista");
        }
        Collections.sort(perros);

        System.out.println("La lista de perros es: ");
        for (String aux2 : perros) {

            System.out.println(aux2);
        }
   
    }
}
