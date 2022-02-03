import java.util.Scanner;

public class FindMaxInSeq {

    public static void main(String[] args) {
        max();
    }

    static void max() {
        // Scanner scanner = new Scanner("2 4 6 9 2 4 5 0");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int maxVal = c;
        while (c != 0) {
            maxVal = (maxVal > c) ? maxVal : c;
            c = scanner.nextInt();
        }
        scanner.close();
        System.out.println(maxVal);
        ;
    }

}
