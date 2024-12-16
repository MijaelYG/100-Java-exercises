/*
 * Find the first non-repeating character in a string
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String Norepetido = "";
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cadena de texto:");
        String texto = scanner.nextLine();

        String[] texto2 = texto.split("");

        for (int i = 0; i < texto2.length; i++) {
            for (int j = 0; j < texto2.length; j++) {
                if(texto2[i].equals(texto2[j])){
                    contador++;
                }
            }
            if(contador == 1){
                Norepetido = texto2[i];
                break;
            }else{
                contador =0;
            }
        }
        System.out.println("Texto: "+ Arrays.toString(texto2));
        System.out.println("Primer caracter no repetido: " + Norepetido);
        scanner.close();
    }
}
