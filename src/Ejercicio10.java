//10. Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una). Realice un algoritmo que lea los
// arreglos y que determine si la diagonal principal de la primera es igual a la diagonal principal de la segunda.
// (Diagonal principal es donde los subíndices I, J son iguales).

import java.util.Scanner;

public class Ejercicio10 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int n = 12;
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[] diagonalVector1 = new int[n];
        int[] diagonalVector2 = new int[n];
        int contador = 0;

        System.out.println("--- COMPLETE LA PRIMERA MATRIZ ---\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz1[i][j] = in.nextInt();

                if (i == j) {
                    diagonalVector1[i] = matriz1[i][j];
                }
            }
        }

        System.out.println("\n--- COMPLETE LA SEGUNDA MATRIZ ---\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz2[i][j] = in.nextInt();

                if (i == j) {
                    diagonalVector2[i] = matriz2[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (diagonalVector1[i] == diagonalVector2[i]) {
                contador++;
            }
        }

        System.out.println("");

        if (contador == diagonalVector1.length) {
            System.out.println("Las diagonales principales de las dos matrices son iguales");
        } else {
            System.out.println("Las diagonales principales de las dos matrices NO son iguales");
        }
    }
}
