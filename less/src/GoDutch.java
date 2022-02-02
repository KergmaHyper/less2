import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSumm = scanner.nextInt();
        int countFriends = scanner.nextInt();
        scanner.close();

        if (totalSumm < 0) {
            System.out.println("Bill total amount cannot be negative");

        } else if (countFriends < 1) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            int partSumm = (totalSumm + totalSumm / 10) / countFriends;
            System.out.println(partSumm);
        }

    }
}
