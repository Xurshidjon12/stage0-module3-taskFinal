package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        System.out.println((number >> 31) == 0);
    }

    public static void main(String[] args) {
        NumbersPrinter printer = new NumbersPrinter();
        int number = -5;
        printer.printIsPositive(number);
    }
}
