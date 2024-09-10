/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej01;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrdenamientoConsola {
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
   public static void mostrarMenuEstadistico(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de Cálculos Estadísticos");
            System.out.println("1. Ingresar datos y calcular");
            System.out.println("2. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarCalculosEstadisticos(scanner);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
    public static void mostrarMenuCadenas(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de Operaciones con Cadenas");
            System.out.println("1. Realizar operaciones con cadenas");
            System.out.println("2. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Para consumir la nueva línea

            switch (opcion) {
                case 1:
                    realizarOperacionesConCadenas(scanner);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
 public static void mostrarMenuOrdenamiento(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de Métodos de Ordenamiento");
            System.out.println("1. Ordenar arreglo");
            System.out.println("2. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOrdenamiento(scanner);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

   