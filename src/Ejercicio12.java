//12. Se tiene un arreglo cien elementos representando calificaciones de los estudiantes de una escuela. Realice
// un algoritmo que lea el arreglo y calcule la calificación promedio del grupo, además, que cuente los estudiantes que
// obtuvieron calificaciones arriba del promedio del grupo.

import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int n = 100;
        int[] calificaciones = new int[n];
        float promedio = 0;
        int contador = 0, sumaCalificaciones = 0;
        int aux = 1;

        System.out.println("Ingrese las calificaciones:\n");

        for (int i = 0; i < n; i++) {
            System.out.print(aux++ + " = ");
            calificaciones[i] = in.nextInt();
            sumaCalificaciones += calificaciones[i];
        }

        promedio = (float) sumaCalificaciones / n;

        System.out.println("\nCalificación promedio: " + promedio);

        for (int i = 0; i < n; i++) {
            if (calificaciones[i] > promedio) {
                contador++;
            }
        }

        System.out.println("\nCantidad de alumnos que obtuvieron calificaciones por encima del promedio: " + contador);



    }
}
