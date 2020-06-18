package fundamentals;

import java.util.*;

public class OptionalTask02 {
    public static void main(String[] args) {
        int n = requestNumber();
        List<Integer> array = new ArrayList();

        for (int i = 0; i < n; i++) {
            int number = requestNumber();
            array.add(number);
        }
        
        Collections.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (getCountsOfDigits(o1) > getCountsOfDigits(o2)) {
                    return 1;
                } else if (getCountsOfDigits(o1) < getCountsOfDigits(o2)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.print("Sorts in ascending order: "+array);
        System.out.println();

        Collections.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (getCountsOfDigits(o1) > getCountsOfDigits(o2)) {
                    return - 1;
                } else if (getCountsOfDigits(o1) < getCountsOfDigits(o2)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.print("Sorts in descending order: "+array);
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

