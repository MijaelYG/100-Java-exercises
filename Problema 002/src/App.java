/*
 *Hacer un algoritmo que permita sumar las cifras de un 
 *numero ingresado y seguir sumando hasta que solo quede una cifra
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int SumaNumeros = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Numero:");
        int NumeroIngresado = scanner.nextInt();
        String Numero = Integer.toString(NumeroIngresado);

        /*
         * Se hace un do while para que se repita
         * la funcion hasta que la cifra sea menor a 2
         */
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
