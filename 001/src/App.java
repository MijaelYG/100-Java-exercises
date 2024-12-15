/*
 *Make an algorithm that allows you to enter a word 
 *and from that word only take the largest set of 
 *consecutive vowels that are in that word.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String vocales = "";
        String VocalesGrandes= "";
        System.out.println("Ingrese la palabra:");
        String palabra = scanner.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e'
            || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o'
            || letra == 'U' || letra == 'u' || letra == 'Á' || letra == 'á' || letra == 'É' || letra == 'é'
            || letra == 'Í' || letra == 'í' || letra == 'Ó' || letra == 'ó'
            || letra == 'Ú' || letra == 'ú') {
                vocales+= letra;
                lista.add(vocales);
            }else{
                vocales = "";
            } 
        }

        for (int i = 0; i < lista.size(); i++) {
            String ListaVocal = lista.get(i);
            if(ListaVocal.length() > VocalesGrandes.length()){
                VocalesGrandes = ListaVocal;
            }
        }

        scanner.close();
        System.out.println("Palabra: " + palabra);
        System.out.println("El conjunto de vocales grandes es: " + VocalesGrandes );
        System.out.println("El total del conjunto de vocales grandes es: " + VocalesGrandes.length());
        System.out.println("Lista: " + lista);
    }
}
