package fundamentals;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String name = requestName();
        System.out.println("Hello " + name + "!");
    }

    static String requestName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        return scanner.nextLine();
    }
}
