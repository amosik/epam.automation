package fundamentals;

public class Task04 {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        for (int i = 0; i <args.length ; i++) {
            int argElement = Integer.parseInt(args[i]);
            sum += argElement;
            mul *= argElement;
        }
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Произведение чисел = " + mul);
    }
}

