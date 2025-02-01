/*
 * Make me an algorithm that solves a quadratic equation of the form
 * ax^2 + bx + c = 0 where a, b and c are integers to be entered. 
 * The algorithm must calculate the roots of the equation and display 
 * the result according to the discriminant:
 * 
 * If the discriminant is greater than 0, two different real solutions must be displayed.
 * If the discriminant is equal to 0, a single real solution must be displayed.
 * If the discriminant is less than 0, the roots must be indicated as complex 
 * (with imaginary part) and the two complex solutions must be displayed.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double discriminante = 0;
        double resul1 =0;
        double resul2 =0;
        System.out.println("Raices de la Ecuacion cuadratica ");
        System.out.println("ax^2 + bx + c = 0");

        System.out.println("Ingrese el numeroa para (a)");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numeroa para (b)");
        int b = scanner.nextInt();

        System.out.println("Ingrese el numeroa para (c)");
        int c = scanner.nextInt();

        discriminante = ((Math.pow(b, 2)) - (4*a*c)); // se puede usar b^2 para decimal resultado

        if(discriminante == 0){
            resul1 = (-b)/(2*a);
            System.out.println("el resultado es: " + resul1);
        }else if (discriminante > 0){
            resul1 = ((-b) + Math.sqrt(discriminante))/(2*a);
            resul2 = ((-b) - Math.sqrt(discriminante))/(2*a);
            System.out.println("el resultado de x1 es: " + resul1);
            System.out.println("el resultado de x2 es: " + resul2);
        }else{
            System.out.println("el resultado de x1 es: " + ((-b)/2*a) + " - "+ ((Math.sqrt(-discriminante))/(2*a)) + "i");
            System.out.println("el resultado de x2 es: " + ((-b)/2*a) + " + "+ ((Math.sqrt(-discriminante))/(2*a)) + "i");
        }
        scanner.close();
    }
}
