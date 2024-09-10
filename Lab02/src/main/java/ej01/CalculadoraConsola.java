package ej01;
      
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CalculadoraConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú Principal");
            System.out.println("1. Cálculos Estadísticos");
            System.out.println("2. Operaciones con Cadenas");
            System.out.println("3. Métodos de Ordenamiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuEstadistico(scanner);
                    break;
                case 2:
                    mostrarMenuCadenas(scanner);
                    break;
                case 3:
                    mostrarMenuOrdenamiento(scanner);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
 