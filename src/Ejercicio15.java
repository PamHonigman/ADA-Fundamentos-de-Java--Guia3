//15. Realice un algoritmo que calcule el producto de dos vectores. Uno de ellos es de una fila con diez elementos
// y el otro con una columna de diez elementos.

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int[] fila = new int[10];
        int[] columna = new int[10];
        int producto = 0;

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("\n-- FILA --\n");

        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un número para la posición " + i + ": ");
            fila[i] = in.nextInt();
        }

        System.out.println("\n-- COLUMNA --\n");

        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un número para la posición " + i + ": ");
            columna[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++){
            producto += fila[i] * columna[i];
        }

        System.out.println("\nEl producto de ambos vectores es = " + producto);
    }
}
