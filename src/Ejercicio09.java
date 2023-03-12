//9. Realice un algoritmo que lea dos vectores de cien elementos y que calcule la suma de éstos guardando su
// resultado en otro vector, el cual se debe presentar en forma impresa.

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int n = 100;
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int[] vectorSuma = new int[n];

        System.out.println("--- COMPLETE EL PRIMER VECTOR ---\n");

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento para la posición " + i + ": ");
            vector1[i] = in.nextInt();
        }

        System.out.println("\n--- COMPLETE EL SEGUNDO VECTOR ---\n");

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento para la posición " + i + ": ");
            vector2[i] = in.nextInt();
        }

        System.out.println("\n\nDATOS INGRESADOS: ");
        System.out.print("\nVector 1: ");

        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vector1[i] + " ]");
        }

        System.out.print("\n\nVector 2: ");

        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vector2[i] + " ]");
        }

        System.out.print("\n\nVector Resultante: ");

        for (int i = 0; i < n; i++) {
            vectorSuma[i] = vector1[i] + vector2[i];
            System.out.print("[ " + vectorSuma[i] + " ]");
        }
    }
}
