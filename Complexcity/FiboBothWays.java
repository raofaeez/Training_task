package Complexcity;

public class FiboBothWays {

    // Recursive Fibonacci
    public static int fibRecursive(int n) {
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 40;

        // Recursive timing
        long startRec = System.currentTimeMillis();
        int recResult = fibRecursive(n);
        long endRec = System.currentTimeMillis();

        // Iterative timing
        long startItr = System.currentTimeMillis();
        int itrResult = fibIterative(n);
        long endItr = System.currentTimeMillis();

        System.out.println("Recursive Fibonacci Result: " + recResult);
        System.out.println("Recursive Time: " + (endRec - startRec) + " ms");

        System.out.println("Iterative Fibonacci Result: " + itrResult);
        System.out.println("Iterative Time: " + (endItr - startItr) + " ms");
    }
}