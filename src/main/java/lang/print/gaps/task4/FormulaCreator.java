package lang.print.gaps.task4;

public class FormulaCreator {
    private static int b;

    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        double score = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        System.out.println(score);

    }
}
