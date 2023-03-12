//8. Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que permita leer el arreglo y que calcule
// y presente los resultados siguientes: El menor elemento del arreglo; la suma de los elementos de las cinco
// primeras filas del arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.

public class Ejercicio08 {

    public static void main(String[] args) {

        int[][] matriz = new int[][]{{8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -15, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 0, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -22, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, -15, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -14, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -36, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11},
                                     {8, 1, 2, 3, 4, -12, 6, 7, 45, -9, 10, 11}};
        int aux = 0;
        int menorElemento = 100;
        int sumaFilas = 0;
        int elementosNegativos[] = new int[15];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menorElemento){
                    menorElemento = matriz[i][j];
                }
            }
        }

        System.out.println("El menor elemento del arreglo es = " + menorElemento);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas += matriz[i][j];
            }
        }

        System.out.println("La suma de todos los elementos de la fila 1 a la 5 es = " + sumaFilas);


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 4; j <= 8; j++) {
                if (matriz[i][j] < 0){
                    elementosNegativos[aux] = matriz[i][j];
                    aux++;
                }
            }
        }

        System.out.println("El total de elementos negativos en las columnas 5 a 9 es = " + aux);
        System.out.println("Los elementos negativos son: ");

        for (int i = 0; i < elementosNegativos.length; i++) {
            System.out.print(" [" + elementosNegativos[i] +  "] ");
        }

    }
}