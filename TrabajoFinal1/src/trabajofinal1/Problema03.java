/*
Elaborar un algoritmo que permita leer 3 números e imprima el mayor. 
Debe validar que sean diferentes, es decir, 
si hay números iguales debe enviar un mensaje de error con un mensaje que diga: 
"LOS VALORES SON IGUALES"
 */
package trabajofinal1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A;
        double B;
        double C;
        double mayor;
        System.out.println("Ingrese el número A");
        A = entrada.nextDouble();
        System.out.println("Ingrese el número B");
        B = entrada.nextDouble();
        System.out.println("Ingrese el número C");
        C = entrada.nextDouble();

        if (A == B || A == C || B == C) {
            System.out.println("LOS VALORES SON IGUALES");
        } else {
            mayor = A;
            if (B > mayor) {
                mayor = B;
                if (C > mayor) {
                    mayor = C;
                }
            }
            System.out.printf("El mayor es: %.2f",mayor);
        }
    }

}
