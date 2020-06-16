package fundamentals;

public class Task04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <args.length ; i++) {
            String argElement = args[i];
            int parseNumber = Integer.parseInt(argElement);
            sum += parseNumber;
        }
        System.out.println(sum);
    }
}

