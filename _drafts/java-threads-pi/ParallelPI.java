/*--------------------------------------------------------------------
 * Práctica 1: Calculando Pi con threads en Java
 * Fecha: 24-Agosto-2015
 * Autores:
 *          A01020319 Fernando Gómez Herrera
 *--------------------------------------------------------------------*/
package mx.itesm.cem.pmultinucleo;

public class ParallelPI {

    private static final long NUM_RECTS = 2_000_000_000;
    private static final short CPU_CORES = 8;

    public static void main(String[] args) throws InterruptedException {

        PIThread threads[] = new PIThread[CPU_CORES];
        final long startTime = System.currentTimeMillis();

        double width = 1.0 / (double) NUM_RECTS;

        // Compute in parts
        for (int i = 0; i < CPU_CORES; i++) {
            long start = i * NUM_RECTS / CPU_CORES;
            long end = (i + 1) * NUM_RECTS / CPU_CORES;

            threads[i] = new PIThread(start, end, width);
            threads[i].start(); // Start computation
        }

        // Wait for all threads to finish and accumulate the sum
        double sum = 0.0;
        for (int i = 0; i < CPU_CORES; i++) {
            threads[i].join();
            sum += threads[i].getSum();
        }

        // PI is just the area
        double area = width * sum;
        final long endTime = System.currentTimeMillis();

        System.out.printf("Resultado = %f, Tiempo: %s\n", area,
                (endTime - startTime) / 1000.0);
    }
}
