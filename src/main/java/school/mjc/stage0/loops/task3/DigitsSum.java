package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){

        int sum = 0;

        String len = "" + t;

        for (int i = 0; i < len.length(); i++) {

            int s = t % 10 ;
            t = t / 10 ;
            sum += s ;

        }

        System.out.println(sum);

    }
}
