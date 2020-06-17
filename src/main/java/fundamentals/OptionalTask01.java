package fundamentals;

import java.util.Scanner;

public class OptionalTask01 {
    public static void main(String[] args) {
        int n = requestNumber();
        int shortestNumber = 0;
        int countOfShortestNumber = 1;
        int longestNumber = 0;
        int countOfLongestNumber = 1;

        for (int i = 0; i < n; i++) {
            int number = requestNumber();
            int count = getCountsOfDigits(number);

            if (count <= countOfShortestNumber) {
                countOfShortestNumber = count;
                shortestNumber = number;
            }

            if (count >= countOfLongestNumber) {
                countOfLongestNumber = count;
                longestNumber = number;
            }
        }
        System.out.println("The shortest number is " + shortestNumber + ", " + "The count of numbers is " + countOfShortestNumber + "\n" +
                "The longest number is " + longestNumber + ", " + "The count of numbers is " + countOfLongestNumber);
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
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
