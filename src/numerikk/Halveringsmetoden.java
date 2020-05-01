package numerikk;

import static java.lang.Math.*;

/**
 * Skript som løser likningen cos(x) - x = 0
 * ved halveringsmetoden. Start-intervallet
 * er satt til å være [a, b] = [0, 1].
 * Implementeringen utfører 17 halveringar.
 */

public class Halveringsmetoden {

    //Funksjonen f(a)
    public static double fa(double a){
        return cos(a) - a;
    }

    //Funksjonen f(b)
    public static double fb(double b){
        return cos(b) - b;
    }

    //Funksjonen f(c)
    public static double fc(double c){
        return cos(c) - c;
    }

    public static void main(String[] args) {
	    double a = 0;
	    double b = 1;

	    for (int i = 0; i < 16; i++){
	        double c = (b+a)/2;
	        if (fa(a) * fc(c) < 0){
	            b = c;
            }else {
	            a = c;
            }
        }
        double x = (b+a)/2;
        System.out.println(x);
    }
}
