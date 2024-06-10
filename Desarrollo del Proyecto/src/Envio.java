public class Envio {
    private int idEnvio;
    private String destino;
    private String estado;
    private String fechaEnvio;
    private String fechaEntrega;

    public Envio(int idEnvio, String destino, String estado, String fechaEnvio, String fechaEntrega) {
        this.idEnvio = idEnvio;
        this.destino = destino;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
    }

    // Getters y Setters
    public int getIdEnvio() { return idEnvio; }
    public String getDestino() { return destino; }
    public String getEstado() { return estado; }
    public String getFechaEnvio() { return fechaEnvio; }
    public String getFechaEntrega() { return fechaEntrega; }

    public void setEstado(String estado) { this.estado = estado; }

    // Método para mostrar la información del envío
    public void mostrarInformacion() {
        System.out.println("ID: " + idEnvio + ", Destino: " + destino +
                ", Estado: " + estado + ", Fecha de Envío: " + fechaEnvio +
                ", Fecha de Entrega: " + fechaEntrega);
    }
}
