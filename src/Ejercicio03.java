//3.Realice un algoritmo que lea un arreglo de M filas y N columnas y que calcule la suma de los elementos de la
// diagonal principal.


import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas que tendrá la matriz 1: ");
        int m = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tendrá la matriz 1: ");
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

        int suma = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    suma += matriz[i][j];
                }
            }
        }

        System.out.println("La suma de los elementos de la diagonal principal es = " + suma);
    }
}
