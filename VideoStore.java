package guia_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.PrintStream;
import java.util.Scanner;

public class VideoStore {

    public static PrintStream show = (System.out);
    public static Scanner scan = new Scanner(System.in);

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

    public VideoStore() { }

    public VideoStore(ArrayList<Cliente> clientes, ArrayList<Pelicula> peliculas, ArrayList alquileres) {
        this.clientes = clientes;
        this.peliculas = peliculas;
        this.alquileres = alquileres;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    /****************
     *
     * Clientes.
     *
     ***************/
    public void mostrarClientes(ArrayList clientes) {
        for (Cliente  i: getClientes()) {
            if (i != null) show.println(i);
        }
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente i : clientes) {
            if (i != null && i.getNombre().equalsIgnoreCase(nombre)) return i;
        }
        return null;
    }

    public Cliente agregarCliente(String nombre, String telefono, String direccion) {
        Cliente cliente = new Cliente(nombre, telefono, direccion);
        for (Cliente i : clientes) {
            if (i == null) i = cliente;
        }
        return cliente;
    }

    /*****************
     *
     * Peliculas.
     *
     ****************/
    public void mostrarPeliculas(ArrayList peliculas) {
        for (Pelicula i : getPeliculas()) {
            if (i != null) show.println(i);
        }
    }

    public Pelicula buscarPelicula(String titulo) {
        for (Pelicula i : peliculas) {
            if (i != null && i.getTitulo().equalsIgnoreCase(titulo)) return i;
        }
        return null;
    }

    /*****************
     *
     * Alquileres.
     *
     ****************/
    public void mostrarAlquileres(ArrayList alquileres) {
        for (Alquiler i : getAlquileres()) {
            if (i != null) show.println(i);
        }
    }

    public Alquiler buscarAlquiler(String pelicula) {
        for (Alquiler i : alquileres) {
            if (i != null && i.getPelicula().equalsIgnoreCase(pelicula)) return i;
        }
        return null;
    }

    public Alquiler alquilarPelicula(String titulo, String nombre) {
        Pelicula pelicula = buscarPelicula(titulo);
        Cliente cliente = buscarCliente(nombre);

        if (pelicula != null && cliente != null) {
            pelicula.setStock(pelicula.getStock() - 1);
            Alquiler alquiler = new Alquiler(cliente, pelicula, LocalDateTime.now());

            for (Alquiler i : alquileres) {
                if (i == null) i = alquiler;
            }
            return alquiler;
        }
        return null;
    }
}
