import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Snail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();

        int hDay = 0;
        int countDays = 0;

        do {
            if (countDays > 0)
                hDay -= b;
            countDays++;
            hDay += a;
        } while (hDay < h);

        System.out.println(countDays);

    }
}
