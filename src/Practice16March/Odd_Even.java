package Practice16March;

public class Odd_Even {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);

        if (a % 2 == 0) {
            System.out.println("a is Even");
        } else {
            System.out.println("a is Odd");
        }
    }
}