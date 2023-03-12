//16. Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce: nombre, horas trabajadas cada
// día de la semana (seis días) y sueldo por hora. Realice un algoritmo que:

//a.	Calcule el total de horas trabajadas a la semana para cada trabajador.
//b.	Calcule el sueldo semanal para cada uno de ellos.
//c.	Calcule el total que pagará la empresa.
//d.	Indique el nombre del trabajador que labora más horas el día lunes.
//e.	Imprima un reporte con todos los datos anteriores.

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        byte cantChoferes = 2;
        double[][] horasChoferes = new double[cantChoferes][6];
        String[] nombres = new String[cantChoferes];
        String[] diasSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado"};
        String trabajadorQueMas = "";
        double horasLunes = 0;

        //Carga de la matriz, y cálculo del trabajador que labora más horas el día lunes
        for (int i = 0; i < cantChoferes; i++) {
            System.out.println("Ingrese el nombre del chofer " + (i+1) + ": ");
            nombres[i] = in.next();
            System.out.println("Ingrese la cantidad de hs que trabajó cada día");
            for (int j = 0; j < 6; j++) {
                System.out.print("\t» " + diasSemana[j] + ": ");
                horasChoferes[i][j] = in.nextDouble();

                if (horasChoferes[i][0] > horasLunes){
                    horasLunes = horasChoferes[i][0];
                    trabajadorQueMas = nombres[i];
                }
            }
            System.out.println("");
        }

        System.out.println("Ingrese el precio por hora: ");
        double precioHora = in.nextDouble();

        //Vector para guardar las hs que trabaja cada chofer
        double[] totalHorasSemanales = new double[cantChoferes];
        //Vector para guardar el pago semanal de cada chofer
        double[] sueldosSemanales = new double[cantChoferes];

        //Calcular ambos valores
        for (int i = 0; i < cantChoferes; i++) {
            for (int j = 0; j < 6; j++) {
                totalHorasSemanales[i] += horasChoferes[i][j];
            }
            sueldosSemanales[i] = totalHorasSemanales[i] * precioHora;
        }

        //Calcular el total que pagará la empresa
        double totalSemanal = 0;

        for (int i = 0; i < cantChoferes; i++) {
            totalSemanal += sueldosSemanales[i];
        }

        //Impresión del reporte
//total de horas trabajadas a la semana para cada trabajador, sueldo semanal para cada uno, total que pagará la empresa.
//Indique el nombre del trabajador que labora más horas el día lunes.

        System.out.println("\n-------------- REPORTE SEMANAL --------------");

        for (int i = 0; i < cantChoferes; i++) {
            System.out.println("\nNombre del chofer: " + nombres[i]);
            System.out.println("\t• Total de horas trabajadas: " + totalHorasSemanales[i]);
            System.out.println("\t• Sueldo de esta semana: $" + sueldosSemanales[i]);
        }

        System.out.println("\nTotal que deberá abonar la empresa: $" + totalSemanal);

        System.out.println("\nEl chofer con más horas trabajadas el día lunes fue " + trabajadorQueMas + ", con un " +
                "total de " + horasLunes + " hs.");














        }
}
