/*
Realice un algoritmo que lea un número de datos y calcule la media de los mismos. 
El usuario decide cuando no ingresar más números.
 */
package trabajofinal1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double numero;
        double suma = 0;
        boolean continuar = true;
        String respuesta;
        double media;

        while (continuar) {
            System.out.println("Ingrese un número");
            numero = entrada.nextDouble();
            suma = suma + numero;
            contador = contador + 1;

            System.out.println("Desea ingresar otro número? (y/n)");
            respuesta = entrada.next();

            if (respuesta.equals("n")) {
                continuar = false;
            }
        }
        media = suma / contador;
        System.out.printf("La media de los números es: %.2f\n", media);
    }
}
