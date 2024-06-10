public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;

    public Cliente(int idCliente, String nombre, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y Setters
    public int getIdCliente() { return idCliente; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }

    // Método para mostrar la información del cliente
    public void mostrarInformacion() {
        System.out.println("ID: " + idCliente + ", Nombre: " + nombre +
                ", Dirección: " + direccion);
    }
}
