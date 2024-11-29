/*
Elaborar un algoritmo que calcule e imprima la suma 
1 + 1/2 + 1/3 + 1/4 ... + 1/100.
 */
package trabajofinal1;

/**
 *
 * @author Luis
 */
public class Problema04 {

    public static void main(String[] args) {
        double suma = 0;
        double i = 1;

        while (i <= 100) {
            suma = suma + 1 / i;
            i = i + 1;
        }

        System.out.printf("La suma es: %.2f\n", suma);
    }
}