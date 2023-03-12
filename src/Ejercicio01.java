//1. Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz transpuesta de
// cualquier matriz de orden M x N.

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas que tendrá la matriz");
        int m = in.nextInt();
        System.out.println("Ingrese la cantidad de columnas que tendrá la matriz");
        int n = in.nextInt();

        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        int matrizTranspuesta[][] = new int[n][m];

        System.out.println("");
        System.out.println("La matriz transpuesta es: ");
        System.out.println("");

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                matrizTranspuesta[j][i] = matriz[i][j];
                System.out.print("[ " + matrizTranspuesta[j][i] + " ]");
            }
            System.out.println("");
        }
    }
}
