/*
 * Create an algorithm that allows you to obtain 
 * the odd numbers from a matrix and as a result 
 * multiply the odd numbers obtained
 */


import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int result =1;
        int[] numeros ={2,4,7,9};

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 != 0){
               result = result * numeros[i];
            }
        }
        System.out.println("El array es: " + Arrays.toString(numeros));
        System.out.println("El resultado es: " + result);
    }
}
