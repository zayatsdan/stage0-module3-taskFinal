package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversed=0;
            while (number != 0){
                int digit = number % 10;
                reversed =reversed*10+digit;
                number=number/10;
            }
        System.out.println(reversed);
    }
}
