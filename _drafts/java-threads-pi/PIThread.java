/*--------------------------------------------------------------------
 * Práctica 1: Calculando Pi con threads en Java
 * Fecha: 24-Agosto-2015
 * Autores:
 *          A01020319 Fernando Gómez Herrera
 *--------------------------------------------------------------------*/
package mx.itesm.cem.pmultinucleo;

public class PIThread extends Thread {

    private final long start;
    private final long end;
    private final double width;

    private double sum;

    public PIThread(long start, long end, double width) {
        this.start = start;
        this.end = end;
        this.sum = 0.0;
        this.width = width;
    }

    @Override
    public void run() {
        double mid, height;

        for (long i = start; i < end; i++) {
            mid = (i + 0.5) * width;
            height = 4.0 / (1.0 + mid * mid);
            this.sum += height;
        }
    }

    public double getSum() {
        return sum;
    }
}
