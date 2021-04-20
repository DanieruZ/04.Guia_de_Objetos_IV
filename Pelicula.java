package guia_04;

public class Pelicula {

    private String titulo;
    private String fechaEstreno;
    private String duracion;
    private String clasificacion;
    private Pais origen;
    private String descripcion;
    private int stock;
    private String genero;
    private String popularidad;

    public Pelicula() { }

    public Pelicula(String titulo, String fechaEstreno, String duracion, String clasificacion, Pais origen, String descripcion, int stock, String genero, String popularidad) {
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.descripcion = descripcion;
        this.stock = stock;
        this.genero = genero;
        this.popularidad = popularidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean equalsIgnoreCase(String pelicula) {
        return false;
    }

    @Override
    public String toString() {
        return "\nPelicula: " +
                "\nTitulo:............... " + this.titulo +
                "\nFecha de estreno:..... " + this.fechaEstreno +
                "\nDuracion:............. " + this.duracion +
                "\nClasificacion:........ " + this.clasificacion +
                "\nPais de origen:....... " + this.origen +
                "\nDescripcion:.......... " + this.descripcion +
                "\nStock:................ " + this.stock +
                "\nPopularidad:.......... " + this.popularidad + "\n" +
                "____________________________________";
    }
}
