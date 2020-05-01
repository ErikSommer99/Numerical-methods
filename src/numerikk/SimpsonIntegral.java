package numerikk;

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 * Skript som estimerer et integral
 * ved Simpsons metode.
 */

public class SimpsonIntegral {

    //Funksjonen f(x)
    public static double f(double x){
        return sin(sqrt(x));
    }

    public static void main(String[] args) {
        //Grense
        double a = 1;
        double b = 3;

        double x;

        //Oppdeling
        Scanner in = new Scanner(System.in);
        System.out.print("Antall delintervall: ");
        int n = in.nextInt();

        //Bredde av søyle
        double dx = (b-a)/n;

        //Deklarerer x og summen S
        double S = dx/3*(f(a)+ f(b));

        //Summerer oddetallsbidrag
        for (int i = 1; i <= (n-1); i+=2){
            x = a + i*dx;
            S = S + 4* f(x)*dx/3;
        }

        //Summerer partallsbidrag
        for (int i = 2; i <= (n-2); i+=2){
            x = a + i*dx;
            S = S + 2* f(x)*dx/3;
        }

        //skriver svaret ut
        System.out.println(S);

    }
}
