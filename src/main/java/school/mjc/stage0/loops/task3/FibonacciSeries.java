package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0,n2 = 1, n3, i;
        System.out.println(n1);//printing 0 and 1
        System.out.println(n2);//printing 0 and 1

        for(i=2;i<lastFibonacci;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
