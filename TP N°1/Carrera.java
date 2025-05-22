import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int competidores = 12;
        int mejorVehiculo = -1;
        double mejorTiempo = Double.MAX_VALUE;

        for (int i = 0; i < competidores; i++) {
            System.out.print("Número de vehículo: ");
            int numero = scanner.nextInt();
            System.out.print("Tiempo en segundos: ");
            double tiempo = scanner.nextDouble();

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorVehiculo = numero;
            }
        }

        System.out.println("El mejor tiempo fue del vehículo " + mejorVehiculo + " con " + mejorTiempo + " segundos.");
        scanner.close();
    }
}
