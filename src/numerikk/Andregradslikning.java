package numerikk;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Skript som løser andregradslikninger.
 * Skriptet leser inn koeffisientene a, b og c
 * i likningen a x^2 + b x + c = 0 fra skjerm,
 * regner ut løsningene og skriver de til skjerm.
 * Eventuelle komplekse løsninger blir ikke
 * skrevet til skjerm.
 */

public class Andregradslikning {

    //Likning
    public static double likning(double a, double b, double c){
        return pow(b, 2) - 4 * a * c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JF

        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();

        double x;
        double x1;
        double x2;

        if (likning(a,b,c) < 0){
            System.out.println("Ingen reelle løsninger");
        }else if (likning(a,b,c) == 0){
            x = -b/(2*a);
            System.out.println("x = " + x);
        } else {
            x1 = (-b-sqrt(likning(a,b,c)))/(2*a);
            x2 = (-b+sqrt(likning(a,b,c)))/(2*a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
