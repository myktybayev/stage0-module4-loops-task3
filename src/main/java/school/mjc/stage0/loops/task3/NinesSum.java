package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        //[ 9 + 99 + 999 + 9999 ... n]
        String nines = "";
        for(int i = 0; i < lengthOfLastNumber; i++){
            nines += "9";
        }

        int ninesInt = (!nines.equals(""))?Integer.parseInt(nines):0;
        int sum = 0;
        for(int j = 1; j < ninesInt; ninesInt /= 10){
            sum += ninesInt;
        }

        System.out.println(sum);
    }
}
