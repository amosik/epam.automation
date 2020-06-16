package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int number = requestNumber();
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < number ; i++) {
            randomNumber = random.nextInt(1000);
            System.out.println(randomNumber);
        }

        for (int i = 0; i < number ; i++) {
            randomNumber = random.nextInt(1000);
            System.out.print(randomNumber + " ");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        return scanner.nextInt();
    }
}