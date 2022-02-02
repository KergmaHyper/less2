package edu.org.test1;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (count == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            if (scanner.hasNextLine()) {
                String tmp = scanner.nextLine();
            }
            String[] stranger = new String[count];
            for (int i = 0; i < count; i++) {
                stranger[i] = scanner.nextLine();
            }
            for (int i = 0; i < count; i++) {
                System.out.println("Hello, " + stranger[i]);
            }
        }
        scanner.close();

    }
}
