import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = scanner.nextInt();

        double[] notas = new double[cantidadNotas];
        double suma = 0;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
            if (notas[i] > max) {
                max = notas[i];
            }
        }

        double promedio = suma / cantidadNotas;
        System.out.println("La nota más alta es: " + max);
        System.out.println("El promedio de notas es: " + promedio);

        scanner.close(); // Esto termina el scanner
    }
}

