/* 
 * Create an algorithm that compresses a string by replacing 
 * repeated character sequences with the character followed 
 * by the number of times it appears. For example, 
 * "aabcccccaaa"  → "a2b1c5a3".
*/


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "";
        int contador =1;
        System.out.println("Ingrese cadena de texto");
        String palabra = scanner.nextLine();
        String[] array = palabra.split("");
        for (int i = 0; i < array.length; i++) {
            if(i < array.length - 1 && array[i].equals(array[i + 1])){
                contador++;
            }else{
                respuesta = respuesta + array[i] + contador;
                contador = 1;
            }
        }
        System.out.println("Cadena de texto comprimida: " + respuesta);
        scanner.close();

    }
}
