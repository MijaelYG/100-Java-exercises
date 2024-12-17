/*
 * Create an Algorithm that can find the maximum 
 * and minimum number in an array
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 10, 5, 1, 8, 9, 15 };

        int numeroMayor=Integer.MIN_VALUE; // or numeros[0]
        int numeroMenor=Integer.MAX_VALUE; // or numeros[0]

        System.out.println("numeros: " + Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El numero Mayor es: " + numeroMayor);
        System.out.println("El numero Menor es: " + numeroMenor);
    }
}
