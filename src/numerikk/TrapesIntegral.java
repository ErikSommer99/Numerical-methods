package numerikk;

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class TrapesIntegral {

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

        //Deklarerer x og summen T
        double T = dx*(f(a) + f(b))/2;
        x = a + dx;

        //Summerer
        for (int i = 0; i < (n-a); i++){
            T = T + f(x)*dx;
            x = x + dx;
        }

        //Skriver ut svaret
        System.out.println(T);
    }
}
