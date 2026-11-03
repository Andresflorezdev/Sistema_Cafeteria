// Ejercicio 7 — Debugging

public class Ejercicio7 {
    public static void main(String[] args) {
        int cantidadVendida = 5; // es un dato de tipo entero y lo que se asigna esta en tipo String queda asi 5 y no "5"
        double precioUnitario = 4500;
        double total = cantidadVendida *  precioUnitario; // aqui falta el punto y coma
        boolean aplicaDescuento = (total > 20000);

        // aqui estaba el segundo error porque solo habia un igual y lo que hacia era asognar, mas no para comparar
        // se puede solo agregar el otro igual "=" o quitar el igual mas el true porque aplicar descuento es de tipo boolean
        if (aplicaDescuento == true) {
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}
