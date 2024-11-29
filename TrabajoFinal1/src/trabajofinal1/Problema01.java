/*
Tomando con referencia la clase de sus ángulos, los triángulos se clasifican en:
- Rectángulo tiene un ángulo recto (igual a 90°) 
- Obtusángulo tiene un ángulo obtuso (mayor que 90° pero menor 180°) 
- Acutángulo los tres ángulos son agudos (menor que 90°) 
Elaborar un algoritmo que permita leer el tamaño de los tres ángulos (A,B,C) de un triángulo e imprima qué tipo es.
 */
package TrabajoFinal1;

import java.util.Scanner;

/**
 * @author Luis
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A;
        int B;
        int C;

        System.out.println("Ingrese el valor del primer ángulo");
        A = entrada.nextInt();

        System.out.println("Ingrese el valor del segundo ángulo");
        B = entrada.nextInt();

        System.out.println("Ingrese el valor del tercer ángulo");
        C = entrada.nextInt();

        if (A + B + C != 180) {
            System.out.println("Los ángulos no forman un triángulo válido");
        } else {
            if (A == 90 || B == 90 || C == 90) {
                System.out.println("Triángulo Rectángulo");
            } else {
                if (A > 90 || B > 90 || C > 90) {
                    System.out.println("Triángulo Obtusángulo");
                } else {
                    System.out.println("Triángulo Acutáncgulo");
                }
            }
        }
    }

}
