import java.util.ArrayList;
import java.util.Scanner;

public class GestionEnvios {
    private static ArrayList<Envio> envios = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<OrdenDeEnvio> ordenesDeEnvio = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Gestión de Envíos:");
            System.out.println("1. Registrar Envío");
            System.out.println("2. Consultar Envíos");
            System.out.println("3. Generar Reporte de Envíos");
            System.out.println("4. Actualizar Estado de Envío");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    registrarEnvio(scanner);
                    break;
                case 2:
                    consultarEnvios();
                    break;
                case 3:
                    generarReporte();
                    break;
                case 4:
                    actualizarEstadoEnvio(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while(opcion != 5);

        scanner.close();
    }

    private static void registrarEnvio(Scanner scanner) {
        System.out.print("Ingrese el ID del envío: ");
        int idEnvio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el destino del envío: ");
        String destino = scanner.nextLine();

        System.out.print("Ingrese el estado del envío: ");
        String estado = scanner.nextLine();

        System.out.print("Ingrese la fecha de envío (AAAA-MM-DD): ");
        String fechaEnvio = scanner.nextLine();

        System.out.print("Ingrese la fecha de entrega (AAAA-MM-DD): ");
        String fechaEntrega = scanner.nextLine();

        Envio envio = new Envio(idEnvio, destino, estado, fechaEnvio, fechaEntrega);
        envios.add(envio);

        System.out.println("Envío registrado exitosamente.");
    }

    private static void consultarEnvios() {
        System.out.println("Lista de envíos:");
        for (Envio envio : envios) {
            envio.mostrarInformacion();
        }
    }

    private static void generarReporte() {
        System.out.println("Reporte de Envíos:");
        for (Envio envio : envios) {
            envio.mostrarInformacion();
        }
    }

    private static void actualizarEstadoEnvio(Scanner scanner) {
        System.out.print("Ingrese el ID del envío: ");
        int idEnvio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Envio envio = null;
        for (Envio e : envios) {
            if (e.getIdEnvio() == idEnvio) {
                envio = e;
                break;
            }
        }

        if (envio == null) {
            System.out.println("Envío no encontrado.");
            return;
        }

        System.out.print("Ingrese el nuevo estado del envío: ");
        String nuevoEstado = scanner.nextLine();

        envio.setEstado(nuevoEstado);
        System.out.println("Estado del envío actualizado exitosamente.");
    }
}
