package fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask03 {
    public static void main(String[] args) {
        int n = requestNumber();
        int number;
        int sumCount = 0;

        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < n; i++) {
            number = requestNumber();
            arrayList.add(number);
            int count = getCountsOfDigits(number);
            sumCount += count;
        }

        double mediumCount = sumCount / n;
        System.out.println("Average numbers length - " + mediumCount + "\n");
        System.out.println("Longer than average length");
        for (Integer element : arrayList) {
            int currentCount = getCountsOfDigits(element);
            if (currentCount > mediumCount) {
                System.out.println("number "+element + " - " + "length "+currentCount);
            }
        }

        System.out.println("Shorter than average length");
            for (Integer element : arrayList) {
                int currentCount = getCountsOfDigits(element);
            if (currentCount < mediumCount) {
                System.out.println("number "+element + " - " + "length "+currentCount);
            }
        }
    }

    static int getCountsOfDigits(long number) {
        return String.valueOf(Math.abs(number)).length();
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        return scanner.nextInt();
    }
}

