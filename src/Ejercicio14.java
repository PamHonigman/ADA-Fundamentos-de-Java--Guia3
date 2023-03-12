//14. Realice un algoritmo que lea una matriz de N filas y M columnas y que cuente los elementos negativos que
// contiene, así como también cuántos elementos de la diagonal principal son igual a cero.

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, m;
        int elementosNegativos = 0, contadorCeros = 0;

        System.out.print("Ingrese la cantidad de filas que tendrá la matriz: ");
        n = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tendrá la matriz: ");
        m = in.nextInt();

        int[][] matriz = new int[n][m];

        System.out.println("\n--- COMPLETE LA MATRIZ ---\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz[i][j] = in.nextInt();

                if (i == j) {
                    if (matriz[i][j] == 0){
                        contadorCeros++;
                    }
                }

                if (matriz[i][j] < 0){
                    elementosNegativos++;
                }
            }
        }

        System.out.println("\nLa matriz contiene " + elementosNegativos + " elementos negativos y " + contadorCeros +
                " ceros en su diagonal principal.");
    }
}
