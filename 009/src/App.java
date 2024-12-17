/*
 * Create an algorithm that counts the occurrences 
 * of a character in a string.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int contador =0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese palabra:");
        String palabra = scanner.nextLine();

        System.out.println("Ingrese carácter que desee contar:");
        char caracter = scanner.next().charAt(0);

        for (int i = 0; i < palabra.length(); i++) {
            if(caracter == palabra.charAt(i)){
                contador++;
            }
        }
        System.out.println("La palabra es: "+ palabra);
        System.out.println("El caracter a contar es: "+ caracter);
        System.out.println("Total de apariciones: "+ contador);
        scanner.close();
    }
}
