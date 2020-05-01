package numerikk;

import static java.lang.Math.*;

/**
 * Skript som løser en likning ved Newtons metode.
 * Input er start-verdien x0, funksjonen som skal
 * være null og den deriverte av funksjonen.
 */

public class NewtonsMetode {

    //Funksjonen som skal være null
    public static double f(double x){
        return cos(x)-x;
    }

    //Den deriverte av funksjonen
    public static double fd(double x){
        return -sin(x)-1;
    }

    public static void main(String[] args) {
        //Startverdi
        double x0 = 15;

        //Pressisjon
        double pres = 5e-5;

        //Maksimalt antall iterasjoner
        double itMax = 50;

        //Itererer x, teller og 'gammel' x
        double x = x0;
        double teller = 1;
        double xOld = 100;

        //Itererer
        while (abs(x-xOld) > pres && teller < itMax){
            xOld = x;
            x = x - f(x)/fd(x);
            teller++;
        }

        //Skriver svaret til skjerm
        if (teller == itMax){
            System.out.println("Dette ser ikke ut til å konvergere");
        }else {
            System.out.println(x);
        }
    }
}
