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
            System.out.println("Menu Principal");
            System.out.println("1. Calculos Estadisticos");
            System.out.println("2. Operaciones con Cadenas");
            System.out.println("3. Metodos de Ordenamiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
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
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }
   public static void mostrarMenuEstadistico(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu de Calculos Estadisticos");
            System.out.println("1. Ingresar datos y calcular");
            System.out.println("2. Regresar al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarCalculosEstadisticos(scanner);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }
    public static void mostrarMenuCadenas(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu de Operaciones con Cadenas");
            System.out.println("1. Realizar operaciones con cadenas");
            System.out.println("2. Regresar al Menu Principal");
            System.out.print("Seleccione una opcion: ");
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
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }
 public static void mostrarMenuOrdenamiento(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu de Metodos de Ordenamiento");
            System.out.println("1. Ordenar arreglo");
            System.out.println("2. Regresar al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOrdenamiento(scanner);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }

    public static void realizarCalculosEstadisticos(Scanner scanner) {
        System.out.print("Ingrese el tamano del arreglo: ");
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
        System.out.println("Desviacion Estándar: " + desviacionEstandar);
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
        System.out.print("Ingrese una linea de texto: ");
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
 public static void realizarOrdenamiento(Scanner scanner) {
        System.out.print("Ingrese el tamano del arreglo: ");
        int tamano = scanner.nextInt();
        double[] arreglo = new double[tamano];

        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = random.nextDouble() * 100;
        }

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        // Burbuja
        double[] arregloOrdenadoBurbuja = ordenarPorBurbuja(arreglo.clone());
        System.out.println("Ordenado por Burbuja: " + Arrays.toString(arregloOrdenadoBurbuja));

        // Inserción
        double[] arregloOrdenadoInsercion = ordenarPorInsercion(arreglo.clone());
        System.out.println("Ordenado por Insercion: " + Arrays.toString(arregloOrdenadoInsercion));

        // Selección
        double[] arregloOrdenadoSeleccion = ordenarPorSeleccion(arreglo.clone());
        System.out.println("Ordenado por Seleccion: " + Arrays.toString(arregloOrdenadoSeleccion));

        // MergeSort
        double[] arregloOrdenadoMergeSort = ordenarPorMergeSort(arreglo.clone());
        System.out.println("Ordenado por MergeSort: " + Arrays.toString(arregloOrdenadoMergeSort));
    }
  public static double[] ordenarPorBurbuja(double[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    public static double[] ordenarPorInsercion(double[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            double clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
        return arreglo;
    }

    public static double[] ordenarPorSeleccion(double[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            double temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }
        return arreglo;
    }

    public static double[] ordenarPorMergeSort(double[] arreglo) {
        if (arreglo.length <= 1) {
            return arreglo;
        }

        int mitad = arreglo.length / 2;
        double[] izquierda = Arrays.copyOfRange(arreglo, 0, mitad);
        double[] derecha = Arrays.copyOfRange(arreglo, mitad, arreglo.length);

        return mezclar(ordenarPorMergeSort(izquierda), ordenarPorMergeSort(derecha));
    }

    public static double[] mezclar(double[] izquierda, double[] derecha) {
        double[] resultado = new double[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }

        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }

        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }

        return resultado;
    }
}