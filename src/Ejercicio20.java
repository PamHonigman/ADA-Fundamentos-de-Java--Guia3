//20. Realice un algoritmo que a partir de la matriz del problema anterior encuentre cuántos elementos tienen valor
// par y cuántos valores impares.

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = 5, n = 5;
        int matriz[][] = new int[m][n];

        /*int matriz[][] = {{56,32,6,3,67},
                          {58,13,471,25,8},
                          {4,68,235,24,73},
                          {258,75,36,20,86},
                          {57,364,45,6,81}};*/

        int impares = 0;
        int pares = 0;

        System.out.println("\n--- COMPLETE LA MATRIZ ---\n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posición [ " + i + " ][ " + j + " ]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("\nMatriz resultante: \n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                if (matriz[i][j] %2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("");
        }

        System.out.println("\nLa matriz posee " + pares + " elementos pares y " + impares + " elementos impares.-");

    }
}
