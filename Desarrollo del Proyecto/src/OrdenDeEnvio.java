public class OrdenDeEnvio {
    private int idOrden;
    private Envio envio;
    private Cliente cliente;

    public OrdenDeEnvio(int idOrden, Envio envio, Cliente cliente) {
        this.idOrden = idOrden;
        this.envio = envio;
        this.cliente = cliente;
    }

    // Getters y Setters
    public int getIdOrden() { return idOrden; }
    public Envio getEnvio() { return envio; }
    public Cliente getCliente() { return cliente; }

    // Método para mostrar la información de la orden de envío
    public void mostrarInformacion() {
        System.out.println("ID Orden: " + idOrden +
                ", Cliente: " + cliente.getNombre() +
                ", Envío: " + envio.getDestino() +
                ", Estado: " + envio.getEstado());
    }
}
