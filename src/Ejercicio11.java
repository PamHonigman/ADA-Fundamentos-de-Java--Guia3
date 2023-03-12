//11. Se tiene una matriz de 12 filas por 19 columnas y se desea un algoritmo para encontrar todos sus elementos
// negativos y para que les cambie ese valor negativo por un cero.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int fil = 12;
        int col = 19;
        int[][] matriz = new int[fil][col];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Ingrese el valor para la posición [ " + i + " ][ " + j + " ]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("\nMatriz original:\n");

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }


        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("\nMatriz modificada: \n");

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }
    }
}
