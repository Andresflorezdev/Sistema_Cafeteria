// Ejercicio 3 — switch

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la categoria del producto: ");
        char categoria = entrada.next().toUpperCase().charAt(0);

        switch (categoria) {

            case 'B':
                System.out.println("Bebida caliente");
                System.out.println("Iva: 0%");
                break;

            case 'F':
                System.out.println("Bebida fria");
                System.out.println("Iva: 5%");
                break;

            case 'C':
                System.out.println("Comida");
                System.out.println("Iva: 8%");
                break;

            case 'P':
                System.out.println("Postre");
                System.out.println("Iva: 8%");
                break;

            default:
                System.out.println("no se reconoce esta categoria");
        }
    }
}
