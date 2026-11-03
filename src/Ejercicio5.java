// Ejercicio 5 — do-while

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cajero;
        double monto;

        System.out.println("nombre del cajero: ");
        cajero = entrada.nextLine();

        do {
            System.out.println("monto de apertura en caja: ");
            monto = entrada.nextDouble();

            if (monto <= 0) {
                System.out.println("este monto es invalido hay que volver a intentarlo");
            }
        } while (monto <= 0);

        System.out.println("cajero: " + cajero);
        System.out.println("apertura en monto: " + monto);

        entrada.close();
    }
}
