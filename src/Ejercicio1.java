// Ejercicio 1 — Variables y tipos de dato

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombreProducto = "acer";
        double precioUnitario = 2546.98;
        int cantInventario = 19;
        boolean disponible = true;
        char codProducto = 'h';

        String reporte = String.format(
                "\nNombre del producto: " + nombreProducto +
                "\nPrecio unitario: " + precioUnitario +
                "\nCantidad inventario: " + cantInventario + "unidades" +
                "\nsigue disponible: " + disponible +
                "\ncodigo del producto: " + codProducto
        );
        System.out.println(reporte);
    }
}
