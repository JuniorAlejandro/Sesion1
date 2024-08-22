package Programas;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Ingrese los ingresos del empleado: ");
        double ingresos = scanner.nextDouble();

        System.out.print("Ingrese los gastos del empleado: ");
        double gastos = scanner.nextDouble();

        double ahorroMensual = ingresos - gastos;
        double ahorroBimestral = ahorroMensual * 2;
        double ahorroSemestral = ahorroMensual * 6;
        double ahorroAnual = ahorroMensual * 12;

        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro bimestral: " + ahorroBimestral);
        System.out.println("Ahorro semestral: " + ahorroSemestral);
        System.out.println("Ahorro anual: " + ahorroAnual);
    }
}