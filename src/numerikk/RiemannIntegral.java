package numerikk;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Skript som estimerer et integral
 * med en Riemann sum.
 */

public class RiemannIntegral {

    //Funksjonen f(x)
    public static double funksjon(double x){
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

        //Ittererer x og summen R
        double R = 0;
        x = a + dx/2;

        //Summerer
        for (int i = 0; i < n; i++){
            R = R + funksjon(x) * dx;
            x = x + dx;
        }

        //Skriver ut svaaret
        System.out.println(R);

    }
}
