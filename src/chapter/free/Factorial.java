package chapter.free;

public class Factorial {
    public static void main(String[] args) {
        // !5 = 5 * 4 * 3 * 2 * 1 = 120
        int res = factorial(5);
        System.out.println(res);
    }

    static int factorial(int value) {
        if (value == 1) {
            return value;
        }
        else {
            int result = value * factorial(value - 1);
            return result;
        }
    }
}
