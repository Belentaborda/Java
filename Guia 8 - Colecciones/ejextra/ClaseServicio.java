/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario
 */
package ejextra;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    Scanner leer = new Scanner(System.in);
     HashSet<String> listaPaises = new HashSet();
    public void llenarLista() {
       
        String opcion;
        do {
            Pais nuevoPais = new Pais();
            System.out.println("Por favor ingrese los paises a guardar ");
            nuevoPais.setNombre(leer.next());
            listaPaises.add(nuevoPais.getNombre());
            System.out.println("Desea agregar mas paises?");
            do {
                opcion = leer.next();
                if (!"n".equalsIgnoreCase(opcion) && !"s".equalsIgnoreCase(opcion)) {
                    System.out.println("Ingrese una opción Correcta: S / N ");
                }
            } while (!"n".equalsIgnoreCase(opcion) && !"s".equalsIgnoreCase(opcion));
        } while (opcion.equalsIgnoreCase("s"));
        System.out.println("La lista de paises es de: " + listaPaises);

    }
    public void ordenado(){ // se pasa por parametro el conjunto
        ArrayList<String> listaOrdenada = new ArrayList (listaPaises); // se convierte el conjunto en una lista para luego ordenarlo 
        Collections.sort(listaOrdenada);
        System.out.println("La lista ordenada es: " + listaOrdenada);
    }
    
    public void iterator() {
        System.out.println("Que pais desea buscar?");
        String opcion1 = leer.next();
        boolean encontrado = false;
        for (String aux : listaPaises) {
            if (aux.equalsIgnoreCase(opcion1)) {
                listaPaises.remove(aux);
                encontrado= true;
            }
        } if(!encontrado)
        System.out.println("El pais no se encuentra en la lista");
    ordenado();

    }
}
