package src;

import src.operaciones.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resultado> resultados = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== Calculadora Matemática POO ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Ver resultados anteriores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = obtenerEntero(scanner);

            Operacion operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new OperacionBasica("Suma");
                    break;
                case 2:
                    operacion = new OperacionBasica("Resta");
                    break;
                case 3:
                    operacion = new OperacionBasica("Multiplicación");
                    break;
                case 4:
                    operacion = new OperacionBasica("División");
                    break;
                case 5:
                    operacion = new Potencia();
                    break;
                case 6:
                    mostrarResultados(resultados);
                    continue;
                case 0:
                    System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                    continue;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = obtenerDecimal(scanner);

            System.out.print("Ingrese el segundo número: ");
            double num2 = obtenerDecimal(scanner);

            double resultado = operacion.calcular(num1, num2);
            System.out.println("Resultado: " + resultado);

            resultados.add(new Resultado(operacion.getNombre(), num1, num2, resultado));

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarResultados(ArrayList<Resultado> resultados) {
        if (resultados.isEmpty()) {
            System.out.println("No hay resultados previos.");
        } else {
            System.out.println("=== Resultados anteriores ===");
            for (Resultado res : resultados) {
                System.out.println(res);
            }
        }
    }

    private static int obtenerEntero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Intente con un número entero: ");
                scanner.next(); // limpiar buffer
            }
        }
    }

    private static double obtenerDecimal(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Intente con un número decimal: ");
                scanner.next(); // limpiar buffer
            }
        }
    }
}
