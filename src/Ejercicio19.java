//19. Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los elementos de la diagonal
// principal de una matriz de 5 por 5 elementos

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = 5, n = 5;

        int matriz[][] = new int[m][n];

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
            }
            System.out.println("");
        }

        int producto = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    producto = producto * matriz[i][j];
                }
            }
        }

        System.out.println("El producto de los elementos de la diagonal principal es = " + producto);

    }
}
