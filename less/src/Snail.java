import java.util.Scanner;

public class Snail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();

        int hDay = 0; // первоначальная высота куда доползла
        int countDays = 0;// количество дней

        do {
            if (countDays > 0)// если не первый день вычесть высоту на которую сползла
                hDay -= b;
            if (hDay <= 0 & countDays > 0)// если за день остались там же или ниже - прекратиь цикл
                break;
            countDays++;// прибавить день

            hDay += a;// прибавить высоту
        } while (hDay < h);// если за день не доползли до вершины, еще на цикл

        if (hDay > 0)
            System.out.println(countDays);
        else
            System.out.println("Impossible");

    }
}
