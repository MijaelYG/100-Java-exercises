/*
 *Create a method to determine if two words are anagrams 
 *(they use the same letters in a different order).
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Boolean> Verificador = new ArrayList<>();

        System.out.println("Ingrese la primera palabra:");
        String palabraO = scanner.nextLine();

        System.out.println("Ingrese la primera palabra:");
        String palabraT = scanner.nextLine();

        String[] palabraOList = palabraO.split("");
        String[] palabraTList = palabraT.split("");
        if(palabraO.length() == palabraT.length()){
            for (int i = 0; i < palabraO.length(); i++) {
                if(palabraOList[i].equals(palabraTList[palabraT.length() - 1 - i])){
                    Verificador.add(true);
                }else{
                    Verificador.add(false);
                }
            }
            if(Verificador.contains(false)){
                System.out.println("las palabras no se leen igual al derecho y al reves");
                System.out.println("Primera palabra: "+Arrays.asList(palabraOList));
                System.out.println("Segunda palabra:" + Arrays.asList(palabraTList));
            }else{
                System.out.println("las palabras se leen igual al derecho y al reves");
                System.out.println("Primera palabra: "+Arrays.asList(palabraOList));
                System.out.println("Segunda palabra:" + Arrays.asList(palabraTList));
            }
        }else{
            System.out.println("las 2 palabras deben tener el mismo tamaño") ;
        } 
        scanner.close();
    }
}
