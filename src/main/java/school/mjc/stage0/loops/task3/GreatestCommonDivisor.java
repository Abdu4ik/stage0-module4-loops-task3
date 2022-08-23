package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int x = 12, y = 8, gcd = 1;
        for(int i = 1; i <= first && second <= y; i++)
        {
            if(first%i==0 && second%i==0)
                gcd = i;
        }
        System.out.printf("GCD of %d and %d is: %d", first, second, gcd);
    }
}
