import java.util.Scanner;

public class AprobDesaprob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int cantidad = scanner.nextInt();
        int[] notas = new int[cantidad];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();

            if (notas[i] >= 6)
                aprobados++;
            else
                desaprobados++;
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

        scanner.close();
    }
}
