/*
 *Create an algorithm that allows you to add the digits of a number 
 *and continue adding until only one digit remains.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int SumaNumeros = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Numero:");
        int NumeroIngresado = scanner.nextInt();
        String Numero = Integer.toString(NumeroIngresado);

        do {
            SumaNumeros = 0;
            for (int i = 0; i < Numero.length(); i++) {
                char NumeroSel = Numero.charAt(i);
                SumaNumeros += Character.getNumericValue(NumeroSel);
            }
            Numero = Integer.toString(SumaNumeros);
            System.out.println("La suma de las cifras es: " + Numero);
        } while (Numero.length() >= 2);

        scanner.close();
        System.out.println("La suma final total de las cifras es: " + SumaNumeros);
    }
}
