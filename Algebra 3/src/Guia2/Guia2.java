// Nombre: Tomas Varela, Franco Velardez
// Guía: N°2
// Ejercicio: 8), 9), 10), 11)

package Guia2;

public class Guia2 implements Practice2 {

    /**
     * @param m min value of the sum
     * @param n max value of the sum
     * @return the sumatory from  m to n
     */
    @Override
    public long exercise8(int m, int n) {
        long result = 0;
        if (m > 0 && n > 0) {
            while (m <= n) {
                result += m;
                m++;
            }
        }
        return result;
    }

    /**
     * @param m min value of the sum
     * @param n max value of the sum
     * @param r min value of the second sum
     * @param s max value of the second sum
     * @return the sum from m to n of the sum from r to s of the multiplication of the
     * current value of the second sum to the current value in the first sum
     */
    @Override
    public long exercise9(int m, int n, int r, int s) {
        long result = 0;
        if (m > 0 && n > 0 && r > 0 && s > 0 ) {
            while (m <= n) {
              for (int i = r; i <= s; i++) {
                  result += m * i;
                }
                m++;
            }
        }
        return result;
    }

    /**
     * @param n the multiplier and the potency of 2
     * @return the sum from 1 to n of the current value multiplied by 2 powered to that value
     */
    @Override
    public long exercise10(int n) {
        long result = 0;
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                result += i * (long) Math.pow(2, i);
            }
        }
        return result;
    }

    /**
     * @param n max value of the sum
     * @param x the coefficient
     * @return the sum from 0 to n of the multiplication of the current value powered to that value
     */
    @Override
    public double exercise11Sumation(int n, int x) {
        double result = 0;
        if (n > 0 && x > 0) {
            for (int i = 0; i <= n; i++) {
                result += i * Math.pow(x, i);
            }
        }
        return result;
    }

    /**
     * @return the formula
     */
    @Override
    public double exercise11Formula(int n, int x) {
        double result = 0;
        if (x > 1 && n > 0) {
            result = ((n * Math.pow(x, n+2)) - (n + 1) * Math.pow(x, n+1) + x) / (Math.pow(x-1, 2));
        }
        return result;
    }
    // wabasokaspdkaosdosdaos
}
