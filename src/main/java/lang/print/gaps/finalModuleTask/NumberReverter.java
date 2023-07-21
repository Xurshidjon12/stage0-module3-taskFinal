package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversed = (number % 10) * 100 + ((number / 10) % 10) * 10 + number / 100;
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();
        int number = 489;
        reverter.revert(number);
    }
}
