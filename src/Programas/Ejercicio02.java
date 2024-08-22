package programas ;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSueldos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();
            totalSueldos += sueldo;
        }

        double promedioSueldo = totalSueldos / 5;

        System.out.println("Total de Sueldos: " + totalSueldos);
        System.out.println("Promedio de Sueldo: " + promedioSueldo);
    }
}
