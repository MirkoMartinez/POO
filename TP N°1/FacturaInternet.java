import java.util.Scanner;

public class FacturaInternet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int clientes = 5;

        for (int i = 0; i < clientes; i++) {
            System.out.print("Ingrese DNI del cliente: ");
            int dni = scanner.nextInt();

            System.out.println("Seleccione tipo de servicio:");
            System.out.println("1. Internet 30 megas ($750)");
            System.out.println("2. Internet 50 megas ($1100)");
            System.out.println("3. Internet 100 megas ($1500 con 5% descuento)");

            int tipo = scanner.nextInt();
            double monto = 0;

            switch (tipo) {
                case 1:
                    monto = 750;
                    break;
                case 2:
                    monto = 1100;
                    break;
                case 3:
                    monto = 1500 * 0.95; // descuento 5%
                    break;
                default:
                    System.out.println("Tipo de servicio inválido.");
                    continue;
            }

            System.out.println("DNI: " + dni + " - Servicio: " + tipo + " - Monto a pagar: $" + monto);
        }

        scanner.close();
    }
}
