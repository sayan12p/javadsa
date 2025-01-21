package thread;
import java.util.stream.IntStream;
public class Thread1 {


        public static void main(String[] args) {
            // Sequential stream
            long start = System.currentTimeMillis();
            IntStream.range(1, 1_000_000).forEach(i -> performTask(i));
            long end = System.currentTimeMillis();
            System.out.println("Sequential stream time: " + (end - start) + " ms");

            // Parallel stream
            start = System.currentTimeMillis();
            IntStream.range(1, 1_000_000).parallel().forEach(i -> performTask(i));
            end = System.currentTimeMillis();
            System.out.println("Parallel stream time: " + (end - start) + " ms");
        }

        private static void performTask(int i) {
            // Simulate a task
            Math.sqrt(i);
        }
    }

