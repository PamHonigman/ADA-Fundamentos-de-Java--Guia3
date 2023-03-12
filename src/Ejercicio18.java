//18. Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella genere dos vectores que
// contengan la suma de sus renglones y la suma de sus columnas.

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        int C = 4, R = 3;
        int[][] matriz = new int[R][C];
        int[] sumaColumnas = new int[C];
        int[] sumaRenglones = new int[R];

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("\n--- COMPLETE LA MATRIZ ---\n");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("Posición [ " + i + ", " + j + " ]: " );
                matriz[i][j] = in.nextInt();
            }
        }

        //Imprimir la matriz
        System.out.println("\nMatriz resultante: \n");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }

        //Sumar renglones
        System.out.println("\nSuma renglones: \n");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sumaRenglones[i] += matriz[i][j];
            }
            System.out.print("[ " + sumaRenglones[i] + " ]");
        }

        //Sumar columnas
        System.out.println("\n\nSuma columnas: \n");
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
            System.out.print("[ " + sumaColumnas[j] + " ]");
        }
    }
}
