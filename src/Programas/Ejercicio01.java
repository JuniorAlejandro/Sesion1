package Programas;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        double subtotal = precio * cantidad;
        double igv = subtotal * 0.18; // IGV del 18%
        double totalPagar = subtotal + igv;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total a pagar: " + totalPagar);
    }
}

