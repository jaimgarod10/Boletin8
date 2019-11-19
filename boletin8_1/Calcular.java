
package boletin8_1;

import java.util.Scanner;

/**
 *
 * @author jgarciaodowd
 */
public class Calcular {
    
    Scanner teclado = new Scanner(System.in);
    private float fin;

    /**
     *
     */
    public void calculo() {
        System.out.println(" Valor numérico entero: ");
        float respuesta = teclado.nextFloat();
        if (respuesta <= 500) {
            fin = respuesta + respuesta * 50 / 100;
        } else if (respuesta <= 1000) {
            fin = respuesta + respuesta * 7 / 100;
        } else if (respuesta <= 5000) {
            fin = respuesta + respuesta * 15 / 100;
        } else {
            fin = respuesta - respuesta * 3 / 100;
        }
        System.out.println("La cantidad: " + respuesta + ".");
        System.out.println("El incremento: " + (fin - respuesta) + ".");
        System.out.println("La cantidad final: " + fin + ".");

    }
    
}
