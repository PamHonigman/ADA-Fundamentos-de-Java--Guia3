//5.Realice un algoritmo para determinar si una matriz es de tipo diagonal: es una matriz cuadrada en la cual todos
// sus elementos son cero, excepto los electos de la diagonal principal.

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m, n, i, j, elementosDiagonal = 0, contadorCeros = 0;

        System.out.print("Ingrese la cantidad de filas que tendrá la matriz: ");
        m = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tendrá la matriz: ");
        n = in.nextInt();

        int matriz[][] = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz[i][j] = in.nextInt();

                if(i == j) {
                    elementosDiagonal++;
                } else {
                    if (matriz[i][j] == 0) {
                        contadorCeros++;
                    }
                }
            }
        }

        if ((m * n - elementosDiagonal) == contadorCeros){
            System.out.println("La matriz es de tipo diagonal");
         } else {
            System.out.println("La matriz no es de tipo diagonal");
        }
    }
}
