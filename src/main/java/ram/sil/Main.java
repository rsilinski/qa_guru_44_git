package ram.sil;

import java.util.Scanner;


public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Are you logged?: yes/no ");
            String status = scanner.nextLine();

            if (status.equals("yes")) {
            System.out.println("Hello, qa.guru!");
            break;
            } else if (i < 3) {
                System.out.println("Try again: ");
            }else {
            System.out.println("You are not logged :(");
            }
        }
    }
}