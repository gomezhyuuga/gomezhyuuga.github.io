---
title: "Práctica #1: Calculando Pi con Threads en java"
categories: lab
---
{% include katex.html %}
# Introducción

PI es un número irracional, una **constante** utilizada en múltiples
áreas de la ciencia y las matemáticas. En geometría euclidiana, se
describe como la relación entre la longitud de una circunferencia y su
diámetro.

Obtenido de [PiNumber][PiNumber], los primeros dígitos de Pi son
los siguientes:

$$\pi ≈ 3.14159265358979323846...$$

Hasta la fecha su valor **exacto** no puede ser definido pero hay
diferentes métodos para aproximar su valor. Uno de ellos es mediante
*integración numérica*, utilizando la siguiente integral:

$$
\pi = \int_{0}^{1} \frac{4}{1 + x^2} dx
$$

En esta práctica se tomó como base el código en C de
[ComputingPi][ComputingPi] y se desarrollaron dos programas para el
cálculo de la anterior aproximación. El objetivo era resolverlo primero
de manera secuencial y posteriormente de forma paralela. Como paso final
se compararon ambos resultados y su **tiempo de ejecución**.

> **Note**
> 
> Los programas se probaron en una computadora de escritorio con las
> siguientes características:
> 
>   - Procesador Intel® Core™ i7-3615QM CPU @ 2.30GHz con cuatro núcleos
>     y ocho *hyperthreads*.
> 
>   - RAM: 8 GB 1600 MHz DDR3
> 
>   - Sistema operativo OS X El Capitan 10.11 Beta (15A262e), Kernel
>     Darwin Version 15.0.0
> 
>   - Compilador Java 1.8.0\_60-b27 de Oracle.

# Solución secuencial

El siguiente bloque de código representa un programa en Java que calcula
de forma secuencial la aproximación de la constante PI.

**SequentialPI.java.**

``` java
/*--------------------------------------------------------------------
 * Fecha: 24-Agosto-2015
 * Autor: Fernando Gómez Herrera
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
```

Esta es la salida del programa:

``` text
Resultado = 3.141593, Tiempo: 27.664
```

# Solución paralela

Esta solución emplea el uso de *Threads en Java*. Para realizar el
cálculo se utilizaron **8 threads** implementados de la siguiente
manera:

Se separa el cálculo del área bajo la curva en 8 partes; cada thread
calcula una parte y al final se suman las áreas.

**ParallelPI.java.**

``` java
/*--------------------------------------------------------------------
 * Fecha: 24-Agosto-2015
 * Autor: Fernando Gómez Herrera
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
```

**PIThread.java.**

``` java
/*--------------------------------------------------------------------
 * Fecha: 24-Agosto-2015
 * Autor: Fernando Gómez Herrera
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
```

La ejecución en paralelo produce la siguiente salida:

``` text
Resultado = 3.141593, Tiempo: 3.493
```

# Resultados

A partir de múltiples corridas de los programas obtuvimos una *media
aritmética* para representar el tiempo de ejecución de cada programa. A
continuación se presenta una tabla que muestra dichos
tiempos.

{: .table .is-bordered .is-striped }
| \# Corrida | Tiempo secuencial (T<sub>1</sub>) | Tiempo paralelo (T<sub>8</sub>) |
| ---------- | --------------------------------- | ------------------------------- |
| 1          | 27.525                            | 3.535                           |
| 2          | 26.951                            | 3.503                           |
| 3          | 26.664                            | 3.493                           |
| 4          | 26.348                            | 3.506                           |
| 5          | 26.361                            | 3.515                           |

Tabla de tiempos de ejecución (expresados en segundos)

S<sub>8</sub> = T<sub>1</sub> / T<sub>8</sub> = 26.759 / 3.510 = 7.6236

Calculando el *speedup* podemos observar que el programa alcanzó un
aumento **aproximado a 8x** en su desempeño respecto a la versión
secuencial. Esto implica casi un *speedup ideal* donde se comporta de
manera *lineal* al aumento de procesadores que ejecutan el programa.

En las siguientes figuras podemos observar el desempeño de los
procesadores corriendo el programa secuencial y el paralelo.

{% include image.html img="pi_sequential.gif" alt="Monitoreo CPU: Secuencial" %}

{% include image.html img="pi_parallel.gif" alt="Monitoreo CPU: Paralelo" %}

De esta forma se puede ver cómo *estamos utilizando al máximo los
recursos de nuestra computadora*, además de comprobar que la tecnología
*HyperThreading* de Intel en efecto simula dos procesadores por *núcleo
físico* (muestra 8 cuando solamente tenemos 4).

# Agradecimientos

Se agradece al profesor **Ariel Ortiz Ramírez** por proveer el código
base [ComputingPi][ComputingPi] del programa secuencial.

# Referencias
- [ITESM CEM. *Computing Pi*][ComputingPi]
- [Wikipedia. *Pi*][PiNumber]

[ComputingPi]: http://webcem01.cem.itesm.mx:8005/apps/s201513/tc3035/notes_computing_pi/
[PiNumber]: https://en.wikipedia.org/wiki/Pi
