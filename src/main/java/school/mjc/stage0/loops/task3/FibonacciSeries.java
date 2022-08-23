package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        System.out.println(0);

        int sum = 0, t1 = 0, t2 = 1;

        for (int i = 0; i <= lastFibonacci; i++) {

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            System.out.println(t1);

        }

    }
}
