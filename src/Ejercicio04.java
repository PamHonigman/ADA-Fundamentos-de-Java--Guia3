//4.Realice un algoritmo para obtener una matriz como el resultado de la resta de dos matrices de orden M x N


import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M, N, i, j;

        System.out.print("Ingrese la cantidad de filas que tendrán las matrices: ");
        M = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que tendrán las matrices: ");
        N = in.nextInt();

        int matriz1[][] = new int[M][N];
        int matriz2[][] = new int[M][N];

        System.out.println("");
        System.out.println("Complete los datos para la matriz 1");

        for (i = 0; i < M; i++ ){
            for (j = 0; j < N; j++ ){
                System.out.print("Ingrese el número para la posición [" + i + "][" + j + "]: " );
                matriz1[i][j] = in.nextInt();
            }
        }

        System.out.println("");
        System.out.println("Complete los datos para la matriz 2");

        for (i = 0; i < M; i++ ){
            for (j = 0; j < N; j++ ){
                System.out.print("Ingrese el número para la posición [" + i + "][" + j + "]: " );
                matriz2[i][j] = in.nextInt();
            }
        }

        System.out.println("");
        System.out.println("Resultado:");

        int resta[][] = new int[M][N];

        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                resta[i][j] = matriz1[i][j] - matriz2[i][j];
                System.out.print("[" + resta[i][j] + "]");
            }
            System.out.println("");
        }


















    }
}
