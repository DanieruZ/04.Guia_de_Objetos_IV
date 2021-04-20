package guia_04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream show = (System.out);
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Monica", "5456454", "colon 5465");
        Cliente cliente1 = new Cliente("Pepe", "5552234", "colon 5325");
        Cliente cliente2 = new Cliente("Sandra", "5479354", "colon 6842");

        Pelicula peli = new Pelicula("Duro de matar", "21/12/1988", "81 minutos", Clasificacion.PG13, Pais.USA, "Aca una descripcion...", 1, Genero.ACCION, Popularidad.star4);
        Pelicula peli1 = new Pelicula("Ataque titan", "21/12/1993", "85 minutos", Clasificacion.NC17, Pais.JPN, "Aca una descripcion...", 1, Genero.HORROR, Popularidad.star3);
        Pelicula peli2 = new Pelicula("Train to Busan 2", "21/12/2010", "79 minutos", Clasificacion.NC17, Pais.KOR, "Aca una descripcion...", 1, Genero.HORROR, Popularidad.star5);

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(peli);
        peliculas.add(peli1);
        peliculas.add(peli2);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente);
        clientes.add(cliente1);
        clientes.add(cliente2);

        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
        Alquiler alquiler = new Alquiler(cliente1, peli, LocalDateTime.now());
        alquileres.add(alquiler);

        VideoStore videoStore = new VideoStore(clientes, peliculas, alquileres);

    }
}
/*
    int selected;

        do {
        selected = menu();
        switch(selected) {
            case 1:


                Pausa.pausar();
                limpiarPantalla();
                break;
            case 2:


                Pausa.pausar();
                limpiarPantalla();
                break;
            case 3:


                Pausa.pausar();
                limpiarPantalla();
                break;
            case 0:
                show.println("Programa finalizado.");
                break;
            default:
                limpiarPantalla();
                limpiarPantalla();
                limpiarPantalla();
                show.println("¡¡¡Opcion incorrecta.!!!");
                Pausa.pausar();
                limpiarPantalla();
                break;
        }
    }while(selected !=0);
}

    public static int menu() {
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    GUIA 04: OBJETOS IV.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    MENU");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [1].Mostrar lista de clientes.");
        show.println("\t   [2].Mostrar lista de peliculas.");
        show.println("\t   [3].Mostrar lista de alquileres.");
        show.println("\t   [4].Buscar cliente.");
        show.println("\t   [5].Buscar pelicula.");
        show.println("\t   [6].Buscar pelicula por genero.");
        show.println("\t   [7]..");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [0].Salir del programa.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n\n\t  Elija una opcion: ");
        show.println("\n");
        return scan.nextInt();
    }

    public static void limpiarPantalla() {
        for(int i=0;i<20;i++) {
            show.println("\n");
        }
    }

    public static class Pausa {
        public static void pausar() {
            show.println("\n");
            show.println(" ----------------------------------------");
            show.println("|Presionar la tecla ENTER para continuar.|");
            show.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            show.println("\n");
            aceptar.nextLine();
        }
    }
}*/
