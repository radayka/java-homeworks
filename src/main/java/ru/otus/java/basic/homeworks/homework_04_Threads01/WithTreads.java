package ru.otus.java.basic.homeworks.homework_04_Threads01;

public class WithTreads {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100_000_000];
        int numThreads = 4;
        int chunkSize = array.length / numThreads;

        Thread[] threads = new Thread[numThreads];

        long start = System.currentTimeMillis();

        for (int t = 0; t < numThreads; t++) {
            int startIndex = t * chunkSize;
            int endIndex = (t == numThreads - 1) ? array.length : startIndex + chunkSize;

            threads[t] = new Thread(() -> {
                for (int i = startIndex; i < endIndex; i++) {
                    array[i] = (int) (1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
                }
            });
            threads[t].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long end = System.currentTimeMillis();
        double durationMin = (end - start) / 1000.0 / 60.0;
        System.out.println("Время выполнения в " + numThreads + " потока: " + String.format("%.2f", durationMin) + " минуты");
    }
}

