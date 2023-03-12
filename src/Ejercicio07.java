//7.Realice un algoritmo que lea un vector y a partir de él forme un segundo vector, de tal forma que el primer
// elemento pase a ser el segundo, el segundo pase a ser el tercero, el último pase a ser el primero, y así
// sucesivamente.

public class Ejercicio07 {
    public static void main(String[] args) {

        int[] vector1 = new int[]{0,1,2,3,4,5,6,7,8,9};
        int vector2[] = new int[10];
        int aux = 0;

        System.out.print("Vector 1 = {");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("}");

        vector2[0] = vector1[9];

        for (int i = 1; i < 10; i++) {
            vector2[i] = vector1[aux];
            aux++;
        }

        System.out.print("Vector 2 = {");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.print("}");

















    }

}
