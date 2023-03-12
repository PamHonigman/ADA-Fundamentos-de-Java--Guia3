
//6. Realice un algoritmo que lea los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
// vectores, y con base en esto se determine el nombre del alumno con la edad mayor del arreglo.

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int cantAlumnos = 10;
        String nombres[] = new String[cantAlumnos];
        int edades[] = new int[cantAlumnos];
        int mayorEdad = 0;
        String alumnoMayor = "";
        int j = 1;

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + j++ + ": ");
            nombres[i] = in.next();
            System.out.print("Ingrese la edad: ");
            edades[i] = in.nextInt();

            if (edades[i] > mayorEdad){
                mayorEdad = edades[i];
                alumnoMayor = nombres[i];
            }
        }

        System.out.println("");
        System.out.println("El mayor de todos los alumnos es: " + alumnoMayor + " y tiene " + mayorEdad + " años");
    }
}
