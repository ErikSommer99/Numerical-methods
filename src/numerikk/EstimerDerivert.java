package numerikk;

import static java.lang.Math.*;

/**
 * Skript som estimerer den deriverte av
 * en funksjon med utgangspunkt i
 * definisjonen av den deriverte. Input
 * er argumentet a og funksjonsuttrykket f.
 */

public class EstimerDerivert {

    public static double f(double x){
        return sqrt(x);
    }

    public static void main(String[] args) {
        //Argument
        double a = 1;

        //Høyde
        double h = 1;

        //Den deriverte
        double fd = 0;

        //Estimerer den deriverte med stadig mindre h
        for (int i = 0; i < 10; i++){
            fd = (f(a+h) - f(a))/h;
            h = h/2;
        }

        System.out.println(fd);

    }
}
