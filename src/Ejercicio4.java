// Ejercicio 4 — while

public class Ejercicio4 {
    public static void main(String[] args) {
        int cafeMolido = 50;
        int pedido = 3;

        while (cafeMolido >= 10) {
            cafeMolido = cafeMolido - pedido;

            System.out.println("lo que resta del inventario: " + cafeMolido);
        }
        System.out.println("Este inventario esta por debajo de las 10 unidades");
    }
}
