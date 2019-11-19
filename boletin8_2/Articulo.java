package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author jgarciaodowd
 */
public class Articulo {
    
    Scanner teclado = new Scanner(System.in);
    private float precio_total;

    /**
     *
     */
    public void calcular() {

        System.out.println(" Número de unidades vendidas? ");
        int unidades = teclado.nextInt();
        System.out.println("Precio del  artículo? ");
        float prezo = teclado.nextFloat();
        if (unidades < 100) {
            precio_total = unidades * prezo;
        } else if (unidades < 200) {
            if (prezo > 4000) {
                precio_total = prezo * unidades * 0.95f;
            } else {
                precio_total = prezo * unidades * 0.98f;
            }
        } else if (unidades >= 200) {
            if (prezo > 4000) {
                precio_total = prezo * unidades * 0.90f;
            } else {
                precio_total = prezo * unidades * 0.92f;
            }

        }
        System.out.println("Unidades " + unidades + ".");
        System.out.println("Precio " + prezo + "€.");
        System.out.println("Descuento " + ((prezo * unidades) - precio_total) + "€.");
        System.out.println("Precio total " + precio_total + "€.");
    }
    
}
