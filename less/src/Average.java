import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int summ = 0;
        int count = 0;
        while ((x = scanner.nextInt()) != 0) {
            summ += x;
            count++;
        }
        scanner.close();
        int average = summ / count;
        System.out.println(average);
    }
}
