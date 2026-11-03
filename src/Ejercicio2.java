// Ejercicio 2 — Operadores

public class Ejercicio2 {
    public static void main(String[] args) {
        double subtotal = 42500.0;
        double descuentoPorcentaje = 0.15;
        double descuento = 30000.0;

        boolean siDescuento;
        double descuentoValor;
        double pagarValor;

        if (subtotal > descuento) {
            siDescuento = true;
            descuentoValor = subtotal * descuentoPorcentaje;
        } else {
            siDescuento = false;
            descuentoValor = 0.0;
        }
        pagarValor = subtotal - descuentoValor;

        System.out.println("se le puede dar descuento?: " + siDescuento);
        System.out.println("valor del descuento: " + descuentoValor);
        System.out.println("Total a pagar: " + pagarValor);
    }
}
