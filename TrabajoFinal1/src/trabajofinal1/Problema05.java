/*
Enlaces a un sitio externo.
Elaborar un algoritmo que permita leer un número par y calcule e imprima la suma 
de los números pares del 2 hasta el número leído. 
Si el número leído es menor a 2 debe imprimir un mensaje de error.
 */
package trabajofinal1;

/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int suma;
        int i;

        System.out.println("Ingrese un número par mayor o igual a 2");
        numero = entrada.nextInt();

        if (numero < 2) {
            System.out.println("Error: El número debe ser mayor o igual a 2");
        } else {
            if (numero % 2 != 0) {
                System.out.println("Error: El número debe ser par");
            } else {
                suma = 0;
                i = 2;

                while (i <= numero) {
                    suma += i;
                    i += 2;
                }

                System.out.printf("La suma es: %d\n", suma);
            }
        }
    }
}
