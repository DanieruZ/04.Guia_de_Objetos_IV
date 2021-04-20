package guia_04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Alquiler {

    public static UUID id = UUID.randomUUID();

    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fechaRetiro = LocalDateTime.now();
    private DateTimeFormatter fechaRetiroMod = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private LocalDateTime fechaDevolucion = LocalDateTime.now();
    private DateTimeFormatter fechaDevolucionMod = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Alquiler(Cliente cliente, Pelicula pelicula, LocalDateTime fechaRetiro) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaRetiro.plusDays(1);
    }

    public static UUID getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    @Override
    public String toString() {
        return "\nAlquiler: " +
                "\nID:...................... " + id +
                "\n"                           + this.cliente +
                "\n"                           + this.pelicula +
                "\nFecha de retiro:......... " + this.fechaRetiro.format(fechaRetiroMod) +
                "\nFecha de devolucion:..... " + this.fechaDevolucion.format(fechaDevolucionMod) + "\n";
    }
}
