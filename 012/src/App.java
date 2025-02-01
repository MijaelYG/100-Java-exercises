/*
 * Make an algorithm that takes an array of integers 
 * and finds the index of an element such that the 
 * sum of the elements to the left of that index is 
 * equal to the sum of the elements to the right of that index.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int resul = 0;
        int res_iz = 0;
        int res_de = 0;
        int[] numeros = { 1, 50, -51, 1, 100, 1 };
        
        for (int i = 0; i < numeros.length; i++) {
            res_iz = 0;
            res_de = 0;
            for (int j = i + 1; j < numeros.length; j++) {
                res_de = res_de + numeros[j];
            }
            for (int j = i - 1; j >= 0; j--) {
                res_iz = res_iz + numeros[j];
            }
            if (res_de == res_iz) {
                resul = i;
                break;
            } else {
                resul = -1;
            }
        }
        if (resul == -1) {
            System.out.println("Array:" + Arrays.toString(numeros));
            System.out.println("No se encontro igualda en las sumas: " + resul);
        } else {
            System.out.println("Array:" + Arrays.toString(numeros));
            System.out.println("Suma totales de la derecha: " + res_de);
            System.out.println("Suma totales de la izquierda: " + res_iz);
            System.out.println("Posicion del indice de la igualdad de sumas: " + resul);
        }
    }
}
