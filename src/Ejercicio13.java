//13. Realice un algoritmo que lea un vector de cien elementos y que calcule su magnitud

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int n = 5;
        int[] vector = new int[n];
        double aux = 0;
        double magnitud = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento para la posición " + (i+1) + ": ");
            vector[i] = in.nextInt();
            aux += (double) (vector[i] * vector[i]);
            //System.out.println(aux);
        }

        magnitud = Math.sqrt(aux);

        System.out.println("\nLa magnitud del vector es = " + magnitud);
    }
}