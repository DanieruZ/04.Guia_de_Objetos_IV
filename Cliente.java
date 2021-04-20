package guia_04;

public class Cliente {

    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente() { }

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "\nCliente: " +
                "\nNombre:....... " + this.nombre +
                "\nTelefono:..... " + this.telefono +
                "\nDireccion:.... " + this.direccion + "\n" +
                "____________________________________";
    }
}
