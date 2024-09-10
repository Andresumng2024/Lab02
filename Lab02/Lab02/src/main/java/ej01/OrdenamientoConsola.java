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

    public static void realizarCalculosEstadisticos(Scanner scanner) {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        double[] arreglo = new double[tamano];

        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = random.nextDouble() * 100;
        }

        System.out.println("Arreglo generado: " + Arrays.toString(arreglo));

        double media = calcularMedia(arreglo);
        double mediana = calcularMediana(arreglo);
        double varianza = calcularVarianza(arreglo, media);
        double desviacionEstandar = Math.sqrt(varianza);
        double moda = calcularModa(arreglo);

        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación Estándar: " + desviacionEstandar);
        System.out.println("Moda: " + (Double.isNaN(moda) ? "No hay moda" : moda));
    }
   public static double calcularMedia(double[] arreglo) {
        double suma = 0;
        for (double num : arreglo) {
            suma += num;
        }
        return suma / arreglo.length;
    }

    public static double calcularMediana(double[] arreglo) {
        Arrays.sort(arreglo);
        if (arreglo.length % 2 == 0) {
            return (arreglo[arreglo.length / 2 - 1] + arreglo[arreglo.length / 2]) / 2.0;
        } else {
            return arreglo[arreglo.length / 2];
        }
    }

    public static double calcularVarianza(double[] arreglo, double media) {
        double suma = 0;
        for (double num : arreglo) {
            suma += Math.pow(num - media, 2);
        }
        return suma / arreglo.length;
    }

    public static double calcularModa(double[] arreglo) {
        double moda = Double.NaN;
        int maxRepeticiones = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int cuenta = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == arreglo[i]) cuenta++;
            }
            if (cuenta > maxRepeticiones) {
                maxRepeticiones = cuenta;
                moda = arreglo[i];
            }
        }

        if (maxRepeticiones > 1) {
            return moda;
        } else {
            return Double.NaN;  // No hay moda si todos los valores son únicos
        }
    }
public static void realizarOperacionesConCadenas(Scanner scanner) {
        System.out.print("Ingrese una línea de texto: ");
        String entrada = scanner.nextLine();

        // Operación 1: Reemplazar vocales
        String caracterMasFrecuente = obtenerCaracterMasFrecuente(entrada);
        String cadenaReemplazada = entrada.replaceAll("[aeiouAEIOU]", caracterMasFrecuente);

        // Operación 2: Invertir orden de letras
        String cadenaInvertida = new StringBuilder(entrada).reverse().toString();

        System.out.println("Cadena con vocales reemplazadas: " + cadenaReemplazada);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String obtenerCaracterMasFrecuente(String entrada) {
        int[] frecuencias = new int[256];
        for (char c : entrada.toCharArray()) {
            frecuencias[c]++;
        }

        char masFrecuente = ' ';
        int maxRepeticiones = 0;
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxRepeticiones) {
                maxRepeticiones = frecuencias[i];
                masFrecuente = (char) i;
            }
        }

        return String.valueOf(masFrecuente);
    }
