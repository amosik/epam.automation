package fundamentals;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
        int num = requestNumber();
        if (num >= 1 && num <= 12) {
            System.out.println("Month number " + num + " is " + months[num - 1]);
        } else {
            System.out.println("Your number is not in the range 1-12");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 and 12");
        return scanner.nextInt();
    }
}
