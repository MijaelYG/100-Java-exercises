/*
 * Write a program that finds a duplicate number in an array of integers.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        int numeros[] = {5,1,3,2,4,2}; //numbers
        
        int contador=0; //number counter

        int numeroRepetido; //repeated number

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    contador++;
                }
            }
            if(contador == 2){
                numeroRepetido = numeros[i];
                System.out.println("El numero repetido es: " + numeroRepetido);
                break;
            }else{
                contador = 0;
            }
        }
        
        if(contador == 0 || contador == 1){
            System.out.println("Ningun numero se repite");
        }
    }
}
