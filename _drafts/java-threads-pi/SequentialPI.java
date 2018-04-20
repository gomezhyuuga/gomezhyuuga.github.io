/*--------------------------------------------------------------------
 * Práctica 1: Calculando Pi con threads en Java
 * Fecha: 24-Agosto-2015
 * Autores:
 *          A01020319 Fernando Gómez Herrera
 *--------------------------------------------------------------------*/
package mx.itesm.cem.pmultinucleo;

public class SequentialPI {

    public static void main(String[] args) {
        long NUM_RECTS = 2_000_000_000;

        double mid, height, width, area;
        double sum = 0.0;

        final long startTime = System.currentTimeMillis();
        width = 1.0 / (double) NUM_RECTS;
        for (long i = 0; i < NUM_RECTS; i++) {
            mid = (i + 0.5) * width;
            height = 4.0 / (1.0 + mid * mid);
            sum += height;
        }
        area = width * sum;
        final long endTime = System.currentTimeMillis();

        System.out.printf("Resultado = %f, Tiempo: %s\n", area,
                (endTime - startTime) / 1000.0);
    }
}
