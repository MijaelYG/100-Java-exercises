/*
 * Write a program that sorts a list of text 
 * strings by their length from smallest to largest.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        String ListaFrutasD[] = {"frambuesa","manzana","pera","sandia","uva","mango"};

        System.out.println("Lista desordenada: ");
        System.out.println(Arrays.toString(ListaFrutasD));
        for (int i = 0; i < ListaFrutasD.length-1; i++) {
            for (int j = 0; j < ListaFrutasD.length - 1 - i; j++) {
                if(ListaFrutasD[j].length() > ListaFrutasD[j + 1].length()){
                    String pos = ListaFrutasD[j];
                    ListaFrutasD[j] = ListaFrutasD[j + 1];
                    ListaFrutasD[j + 1] = pos;
                }
            }
        }
    
        System.out.println("Lista ordenada: ");
        System.out.println(Arrays.toString(ListaFrutasD));
    }
}
