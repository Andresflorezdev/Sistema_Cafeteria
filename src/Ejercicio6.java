// Ejercicio 6 — for y arrays

public class Ejercicio6 {
     public static void main(String[] args) {
         String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
         double[] precios = {3500, 5000, 4000, 4500, 6000};

         double suma = 0;
         double promedio;

         for (int i = 0; i < productos.length; i++) {
             System.out.println("numero de producto: " + (i + 1));
             System.out.println("Nombre: " + productos[i]);
             System.out.println("Precio: " + precios[i]);
             System.out.println("-------------------------");

             suma = suma + precios[i];
         }

         promedio = suma / precios.length;

         System.out.println("\nprecio promedio del menu: " + promedio);
    }
}
