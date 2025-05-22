import java.util.Scanner;

public class Censo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, varones = 0, mujeres = 0, varones16165 = 0;
        int maxEdad = -1;
        String maxEdadDatos = "";

        while (true) {
            System.out.print("Ingrese número de documento (0 para terminar): ");
            int dni = scanner.nextInt();
            if (dni == 0) break;

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            System.out.print("Sexo (F/M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            total++;

            if (sexo == 'M') {
                varones++;
                if (edad >= 16 && edad <= 65) {
                    varones16165++;
                }
            } else if (sexo == 'F') {
                mujeres++;
            }

            if (edad > maxEdad) {
                maxEdad = edad;
                maxEdadDatos = "DNI: " + dni + ", Edad: " + edad + ", Sexo: " + sexo;
            }
        }

        System.out.println("Total censados: " + total);
        System.out.println("Cantidad de varones: " + varones);
        System.out.println("Cantidad de mujeres: " + mujeres);

        if (varones > 0) {
            double porcentaje = (varones16165 * 100.0) / varones;
            System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentaje + "%");
        }

        System.out.println("Persona con mayor edad: " + maxEdadDatos);
        scanner.close();
    }
}
