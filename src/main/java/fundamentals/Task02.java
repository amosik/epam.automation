package fundamentals;

public class Task02 {
    public static void main(String[] args) {
        for (String element : args) {
            System.out.print(element + " ");
        }
        System.out.println();
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.print(args[i] +" ");
    }
}