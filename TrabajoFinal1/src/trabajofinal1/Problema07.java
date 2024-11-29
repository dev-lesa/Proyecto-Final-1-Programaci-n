/*
Utilizando una estructura repetitiva diseñe un algoritmo para calcular e 
imprimir los k primeros términos de la serie:
S1 = 12−11+24−22+36−33+48−44
 */
package trabajofinal1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int k;
        int i;
        int positivo;
        int negativo;
        String cadena;

        System.out.println("Ingrese el valor de k (cantidad de términos a calcular)");
        k = entrada.nextInt();

        cadena = "S1 = ";
        i = 1;

        while (i <= k) {
            positivo = 12 * i;
            negativo = 11 * i;

            cadena = String.format("%s + %d - %d ", cadena, positivo, negativo);
            i += 1;
        }

        System.out.println(cadena);
    }
}