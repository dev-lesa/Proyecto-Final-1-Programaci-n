/*
Escriba un algoritmo que seleccione y presente los primeros 20 números enteros 
que sean divisibles entre 7.
 */
package trabajofinal1;

/**
 *
 * @author Luis
 */
public class Problema10 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;

        while (contador < 20) {
            if (numero % 7 == 0) {
                System.out.println(numero);
                contador = contador + 1;
            }
            numero = numero + 1;
        }
    
    }
   
}
