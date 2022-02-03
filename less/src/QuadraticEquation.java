import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        DecimalFormat numFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(" 1, -2, 1");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        scanner.close();
        float D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("no roots");
        } else if (D == 0) {
            float x = -b / 2 / a;
            System.out.printf("%s\n", numFormat.format(x));
        } else {
            double x1 = ((-b - Math.sqrt(D)) / 2 / a);
            double x2 = ((-b + Math.sqrt(D)) / 2 / a);
            System.out.printf("%s %s\n", numFormat.format(x1), numFormat.format(x2));
        }

    }
}
