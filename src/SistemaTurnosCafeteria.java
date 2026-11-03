public class SistemaTurnosCafeteria {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida, P=Postre

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        int brownieInventario = 10;
        double aperturaMonto = -1;

        do {
            System.out.println("Caja abierta...");
            aperturaMonto = 50000;

            if (aperturaMonto <= 0) {
                System.out.println("Este modulo esta invalido");
            }

        } while (aperturaMonto <= 0);

        System.out.println("caja abierta con: " + aperturaMonto);

        int pedidosProcesados = 0;
        double totalRecaudado = 0;
        double valorMayor = 0;
        int pedidoMayor = 0;

        for (int i = 0; i < pedidoProducto.length; i++) {
            int producInd = pedidoProducto[i];
            String nombre = nombres[producInd];
            int cant = pedidoCantidad[i];
            double precio = precios[producInd];
            char categoria = categorias[producInd];

            if (producInd == 4) {
                if (cant > brownieInventario) {
                    System.out.println("producto agotado: " + nombre);
                    continue;
                }
                brownieInventario = brownieInventario - cant;
            }

            double subtotal = precio * cant;

            System.out.println("numero de pedido: " + (i + 1));
            System.out.println("producto: " + nombre);
            System.out.println("cantidad: " + cant);

            System.out.println("categoria: ");

            switch (categoria) {
                case 'B':
                    System.out.println("Bebida caliente");
                    break;
                case 'F':
                    System.out.println("Bebida fria");
                    break;
                case 'C':
                    System.out.println("Comida");
                    break;
                case 'P':
                    System.out.println("Postre");
                    break;
            }
            System.out.println("subtotal: $" + subtotal);

            double total;

            if (subtotal > 12000) {
                total = subtotal - (subtotal * 0.10);
                System.out.println("descuento aplicado: 10%");
            } else {
                total = subtotal;
                System.out.println("no tiene descuento");
            }
            System.out.println("valor a pagar: " + total);

            pedidosProcesados++;
            totalRecaudado = totalRecaudado + total;

            if (total > valorMayor) {
                valorMayor = total;
                pedidoMayor = i + 1;
            }
            System.out.println("---------------------------------");
        }

        System.out.println("-------------------cerrando-turno-------------------");
        System.out.println("pedidos procesados: " + pedidosProcesados);
        System.out.println("total recuadado: " + totalRecaudado);
        System.out.println("pedido con mayor valor " + pedidoMayor);
        System.out.println("valor del pedido mayor: " + valorMayor);
        System.out.println("brownies restantes: " + brownieInventario);
        System.out.println("----------------------------------------------------");
    }
}
