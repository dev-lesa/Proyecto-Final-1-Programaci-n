/*
El señor Roper es propietario de 20 ediﬁcios de departamentos. 
Cada ediﬁcio contiene 15 unidades que renta por 800 dólares por mes cada uno. 
Diseñe la aplicación que daría salida a 12 talonarios de pago para cada uno 
de los 15 departamentos en cada uno de los 20 ediﬁcios. 
Cada talonario debe contener el número de ediﬁcio (1 a 20), 
el número de departamento (1 a 15), 
el mes (1 a 12) y la cantidad de renta que se debe.
 */
package trabajofinal1;

/**
 *
 * @author Luis
 */
public class Problema09 {

    public static void main(String[] args) {
        int edificio = 1;
        int departamento;
        int mes;
        double renta = 800;

        while (edificio <= 20) {
            departamento = 1;
            while (departamento <= 15) {
                mes = 1;
                while (mes <= 12) {
                    System.out.printf("Edificio: %d, Departamento: %d, Mes: %d, "
                            + "Renta: %.2f%n", edificio, departamento, mes, renta);
                    mes = mes + 1;
                }
                departamento = departamento + 1;
            }
            edificio = edificio + 1;
        }
    }
}