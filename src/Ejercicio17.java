//17. Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un elemento negativo. Realice un
// algoritmo que indique la posición que ese elemento ocupa en el arreglo (en la fila y la columna en la que se
// encuentra ese elemento).

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int m = 6;
        int n = 8;
        int[][] matriz = new int[m][n];

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese " + (m * n) + " números a continuación para rellenar la matriz");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.println("[ " + i + ", " + j + " ]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println("El elemento negativo se encuentra en la posición [ " + i + ", " + j + " ].");
                }
            }
        }
    }
}
