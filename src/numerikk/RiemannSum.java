package numerikk;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Skript som regner ut en Riemann sum
 * med en regulær r oppdeling og venstre seleksjon.
 * Funksjonen i summen er hardkodet i
 * starten - sammen med grensene.
 * Tallet på intervall i oppdelingen blir
 * lest inn fra skjerm.
 */

public class RiemannSum {

    //Funksjon
    static double f(double x){
        return cos(pow(x, 2)/3);
    }

    public static void main(String[] args) {
        //Grenser
        double a = -2;
        double b = 2;

        //Oppdeling
        Scanner in = new Scanner(System.in);
        System.out.print("Antall delintervall: ");
        int n = in.nextInt();

        //Bredde på delintervall
        double dx = (b-a)/n;

        //Itererer argumentet x og summen R
        double x = a;
        double R = 0;

        for (int i = 0; i < n; i++){
            R = R + f(x) * dx;
            x = x + dx;
        }

        System.out.println(R);

    }

}
