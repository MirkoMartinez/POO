import java.util.Scanner;

public class ProductosCosto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        int[] cantidades = new int[n];
        double[] costos = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1));
            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();
            System.out.print("Costo unitario: ");
            costos[i] = scanner.nextDouble();
            total += cantidades[i] * costos[i];
        }

        System.out.println("Precio total de todos los productos: $" + total);
        System.out.println("Productos con total mayor a $1000:");

        for (int i = 0; i < n; i++) {
            double subtotal = cantidades[i] * costos[i];
            if (subtotal > 1000) {
                System.out.println("Producto " + (i + 1) + " - Total: $" + subtotal);
            }
        }

        scanner.close();
    }
}
