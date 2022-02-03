import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeaples = scanner.nextInt();
        int countPcsPerPizza = scanner.nextInt();
        scanner.close();
        int countPizza = 1;

        while (((++countPizza * countPcsPerPizza) % countPeaples) != 0) {
        }
        System.out.println(countPizza);
    }
}
