/*
 * Make an algorithm that checks if a string is a palindrome
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean verificador = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la oracion o palabra sin tildes: ");
        String palabra = scanner.nextLine();
        
        String palabraSinEspacios = palabra.replace(" ","").toLowerCase();

        for (int i = 0; i < palabraSinEspacios.length(); i++) {
            if(palabraSinEspacios.charAt(i) == palabraSinEspacios.charAt(palabraSinEspacios.length()-1-i)){
                System.out.println("letra1: "+ palabraSinEspacios.charAt(i));
                System.out.println("letra2: "+ palabraSinEspacios.charAt(palabraSinEspacios.length()-1-i));
                verificador = true;
            }else{
                verificador = false;
                break;
            }
        }

        if(verificador){
            System.out.println("la palabra es palindromo: "+ palabra);
        }else{
            System.out.println("la palabra no es palindromo: "+ palabra);
        }
        scanner.close();
    }
}
