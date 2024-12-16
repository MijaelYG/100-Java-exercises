/*
 *Find the characters that are repeated in a string
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        ArrayList<String> CaracteresR = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cadena de texto:");
        String texto = scanner.nextLine();

        String[] texto2 = texto.split("");

        for (int i = 0; i < texto2.length; i++) {
            for (int j = 0; j < texto2.length; j++) {
                if(texto2[i].equals(texto2[j])){
                    contador++;
                    if(contador >=2){
                        if(!CaracteresR.contains(texto2[i])){
                            CaracteresR.add(texto2[i]);
                            System.out.println("Caracteres repetidos: " + CaracteresR);
                            contador = 0;
                            break;
                        }
                        contador = 0;
                        break;
                    }
                }
            }
        }
        System.out.println("Texto: "+ texto);
        System.out.println("Caracteres repetidos: " + CaracteresR);
        scanner.close();
    }
}
