/*
En un almacén de venta de trajes, si se compra uno se hace el 10% de descuento, 
si se compran 2, el 20%, si se compran 3, el 40%, y si compra más de 3, el 60%. 
Elaborar un algoritmo que lea la cantidad de trajes y el precio unitario (todos tienen 
el mismo precio) e imprima el subtotal por pagar, el descuento y el total por pagar.
 */
package TrabajoFinal1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadTrajes;
        double precioUnitario;
        double subtotal;
        double descuento;
        double total;

        System.out.println("Ingrese la cantidad de trajes");
        cantidadTrajes = entrada.nextInt();

        System.out.println("Ingrese el precio unitario del traje");
        precioUnitario = entrada.nextDouble();

        subtotal = cantidadTrajes * precioUnitario;

        if (cantidadTrajes == 1) {
            descuento = subtotal * 0.1;
        } else {
            if (cantidadTrajes == 2) {
                descuento = subtotal * 0.2;
            } else {
                if (cantidadTrajes == 3) {
                    descuento = subtotal * 0.40;
                } else {
                    descuento = subtotal * 0.60;
                }

            }
        }
        total = subtotal - descuento;
            System.out.printf("Subtotal: %.2f\nDescuento: %.2f\nTotal: %.2f\n", 
                    subtotal,descuento,total);
    }
}
