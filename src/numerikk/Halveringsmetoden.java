package numerikk;

/**
 * Skript som løser likningen cos(x) - x = 0
 * ved halveringsmetoden. Start-intervallet
 * er satt til å være [a, b] = [0, 1].
 * Implementeringen utfører 17 halveringar.
 */

public class Halveringsmetoden {

    public static void main(String[] args) {
	    double a = 0;
	    double b = 1;

	    double fa = Math.cos(a) - a;
	    double fb = Math.cos(b) - b;

	    for (int i = 0; i < 16; i++){
	        double c = (b+a)/2;
	        double fc = Math.cos(c) - c;
	        if (fa * fc < 0){
	            b = c;
            }else {
	            a = c;
            }
        }
        double x = (b+a)/2;
        System.out.println(x);
    }
}
