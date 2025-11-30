package learning.JavaPattern;

public class Recursion {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static long calculateFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }


    public static void main(String[] args) {
        int count = 10;

        System.out.print("سلسلة فيبوناتشي لـ " + count + " أرقام: ");

        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("-----------");

        int number = 5;
        long result = calculateFactorial(number);

        System.out.println("مضروب العدد " + number + " هو: " + result); // الناتج: 120

    }
}
