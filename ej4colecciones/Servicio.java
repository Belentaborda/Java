/*
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ej4colecciones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Usuario
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> lista  =  new ArrayList();
    
    
    public void crearPelicula(){
        String opcion;
        do{
            Pelicula nuevaLista = new Pelicula();
            
             System.out.println("Ingrese el titulo de la pelicula: ");
            nuevaLista.setTitulo(leer.next());
            System.out.println("Ingrese el director");
            nuevaLista.setDirector(leer.next());
            System.out.println("Ingrese la duracion en horas");
            nuevaLista.setDuracion(leer.nextInt());
            
            lista.add(nuevaLista);
            
            System.out.println("Desea agregar otra película? S / N");
            do{
                opcion= leer.next();
                 if (!"n".equalsIgnoreCase(opcion) && !"s".equalsIgnoreCase(opcion)){
                            System.out.println("Ingrese una opción Correcta: S / N ");      
                }
            }while(!"n".equalsIgnoreCase(opcion) && !"s".equalsIgnoreCase(opcion));
        }while(opcion.equalsIgnoreCase("s"));

    }
    public void mostrar(){
        for (Pelicula aux : lista) {
            System.out.println(aux);
        } 
    }
    public void mayor1hora(){
        System.out.println("Las peliculas mayores a 1 hora son: ");
        for(Pelicula aux1 : lista) {
            if(aux1.getDuracion()>1){
                System.out.println(aux1);
            }
        }
    }
    public void MayoraMenor(){
        Collections.sort(lista , Comparadores.compDescendente);
       // lista.sort(Comparadores.compDescendente); // otra posibilidad para llamar a los comparadores
       
        System.out.println("La duracion en orden descendente, son las siguientes peliculas:");
        for (Pelicula aux2 : lista) {
            System.out.println(aux2);
        }
    } public void MenoraMayor(){
        Collections.sort(lista , Comparadores.compAscendente);
        System.out.println("La duracion en orden ascendente, son las siguientes peliculas:");
        for (Pelicula aux3 : lista) {
            System.out.println(aux3);
    }
    }
    public void TituloAlf(){
        Collections.sort(lista , Comparadores.tituloAscendente);
        System.out.println("El orden alfabetico de los titulos de las peliculas es :");
        for (Pelicula aux4 : lista) {
            System.out.println(aux4);
    }
    }
    public void DirectorAlf(){
        Collections.sort(lista , Comparadores.directorAscendente);
        System.out.println("El orden alfabetico de los directores de las peliculas es :");
        for (Pelicula aux5 : lista) {
            System.out.println(aux5);
    }
    }        
    public void menu() {
        crearPelicula();
        int option;
        boolean salir = false;
        do {
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Mostrar todas películas agregadas");
            System.out.println("2. Motrar películas con más de una hora de duración");
            System.out.println("3. Ordenar y mostrar las películas de acuerdo a su duracion (de mayor a menor)");
            System.out.println("4. Ordenar y mostrar las películas de acuerdo a su duracion (de menor a mayor)");
            System.out.println("5. Ordenar y mostrar las películas por título, alfabéticamente (a - z)");
            System.out.println("6. Ordenar y mostrar las películas por nombre del director, alfabéticamente (a - z)");
            System.out.println("7. Salir");
            option = leer.nextInt();

            switch (option) {
                case 1:
                    mostrar();
                    break;
                    case 2:
                    mayor1hora();
                    break;
                case 3:
                    MayoraMenor();
                    break;
                case 4:
                    MenoraMayor();
                    break;
                case 5:
                    TituloAlf();
                    break;
                case 6:
                   DirectorAlf();
                    break;
                case 7:
                    salir = true;
                    break;
            }

        } while (!salir);

        System.out.println("Nos vemos pronto. Que tengas un lindo día pelotudo :D");
    }


}
