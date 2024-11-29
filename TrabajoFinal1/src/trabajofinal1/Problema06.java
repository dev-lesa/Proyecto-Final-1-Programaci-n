/*
Elaborar un algoritmo que permita leer una medida (N) en número de metros y que 
imprima una tabla de equivalencias a yardas, pulgadas y pies, desde 1 metro hasta N metros de uno en uno. 
Equivalencias: 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm. 
Se debe imprimir la tabla siguiente:

Metros	Yardas	Pulgadas Pies
1	?	?	?
2	?	?	?
3	?	?	?
...	?	?	?
N	?	?	?

 */
package trabajofinal1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;
        double metro = 1;
        double centimetros;
        double pulgadas;
        double pies;
        double yardas;
        String tabla;

        tabla = "Metros\tYardas\tPulgadas\tPies\n";

        System.out.println("Ingrese el número máximo de metros");
        N = entrada.nextInt();

        while (metro <= N) {
            centimetros = metro * 100;
            pulgadas = centimetros / 2.54;
            pies = pulgadas / 12;
            yardas = pies / 3;

            tabla = String.format("%s%.2f\t%.2f\t%.2f\t%.2f\n", tabla, metro, 
                    yardas, pulgadas, pies);
            metro = metro +1;
        }

        System.out.printf("%s", tabla);
    }
}