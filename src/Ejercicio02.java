//2. Realice el algoritmo para obtener el producto de dos matrices de orden M x N y P x Q

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas que tendrá la matriz 1: ");
        int M = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tendrá la matriz 1: ");
        int N = in.nextInt();

        int matriz1[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz1[i][j] = in.nextInt();
            }
        }

        System.out.print("Ingrese la cantidad de filas que tendrá la matriz 2: ");
        int P = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tendrá la matriz 2: ");
        int Q = in.nextInt();

        int matriz2[][] = new int[P][Q];

        for (int i = 0; i < P; i++) {
            for (int j = 0; j < Q; j++) {
                System.out.print("Ingrese el número para la posición [ " + i + " ][ " + j + " ]: ");
                matriz2[i][j] = in.nextInt();
            }
        }

        int producto[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                producto[i][j] = matriz1[i][j] * matriz2[i][j];
                System.out.print("[" + producto[i][j] + "]");
            }
            System.out.println("");
        }










    }
}

