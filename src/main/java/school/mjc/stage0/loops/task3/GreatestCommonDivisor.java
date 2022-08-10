package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = second, store = 0;

        if(first > second){
            max = first;
        }

        for(int i = 2; i <= max; i++){
            if(first%i==0 && second%i==0){
                store = i;
            }
        }
        System.out.println(store);
    }
}

/*
Algorithm to Find GCD
Declare two variables, say x and y.
Run a loop for x and y from 1 to max of x and y.
Check that the number divides both (x and y) numbers completely or not. If divides completely store it in a variable.
Divide the stored number.
 */