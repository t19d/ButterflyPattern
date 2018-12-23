package butterflypattern;

import java.util.Scanner;

/**
 *
 * @author td
 */
public class ButterflyPattern {

    public static void main(String[] args) {

        int numero = 0;
        boolean condicion = false;
        String result = "";
        System.out.println("Enter input value for Butterfly Pattern: ");
        Scanner scn = new Scanner(System.in);
        do {
            condicion = scn.hasNextInt();
            if (condicion) {
                numero = scn.nextInt();
            } else {
                System.out.println("Enter input value for Butterfly Pattern: ");
                scn.nextLine();
            }
        } while (!condicion);
        int contador = (2 * (numero - 1)) - 1;

        String[] butterFly = new String[((numero * 2) - 1)];
        for (int i = 0; i < numero; i++) {
            result = "";
            if (i != (numero - 1)) {
                result = "";
                for (int j = 0; j <= i; j++) {
                    result += "*";
                }
                for (int j = 0; j < contador; j++) {
                    result += " ";
                }
                for (int j = 0; j <= i; j++) {
                    result += "*";
                }
                butterFly[i] = result;
                butterFly[(butterFly.length - 1) - i] = result;
                contador -= 2;
            } else {
                result = "";
                for (int j = 0; j < ((numero * 2) - 1); j++) {
                    result += "*";
                }
                butterFly[i] = result;
            }
        }
        for (String butterFly1 : butterFly) {
            System.out.println(butterFly1);
        }
    }
}
