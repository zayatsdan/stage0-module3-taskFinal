package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int summ = 0;
        while (number != 0) {
            int digit = number % 10;
            summ = summ + digit;
            number = number / 10;
        }
        System.out.println(summ);
    }
}
