import java.util.Scanner;

public class Camiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int totalCamiones = 4;
        int contadorTe = 0;

        String[] patentes = new String[totalCamiones];
        String[] choferes = new String[totalCamiones];
        String[] cargas = new String[totalCamiones];
        String[] horas = new String[totalCamiones];

        for (int i = 0; i < totalCamiones; i++) {
            System.out.println("Camión " + (i + 1));
            System.out.print("Patente: ");
            patentes[i] = scanner.next();
            scanner.nextLine(); // consumir salto
            System.out.print("Nombre y apellido del chofer: ");
            choferes[i] = scanner.nextLine();
            System.out.print("Tipo de carga (madera, yerba o te): ");
            cargas[i] = scanner.next().toLowerCase();
            System.out.print("Hora de egreso: ");
            horas[i] = scanner.next();

            if (cargas[i].equals("te")) {
                contadorTe++;
            }
        }

        System.out.println("\n--- Datos de los camiones ---");
        for (int i = 0; i < totalCamiones; i++) {
            System.out.println("Camión " + (i + 1) + ": " + patentes[i] + ", Chofer: " + choferes[i] + ", Carga: " + cargas[i] + ", Hora: " + horas[i]);
        }

        System.out.println("Cantidad de camiones que transportaron té: " + contadorTe);
        scanner.close();
    }
}

