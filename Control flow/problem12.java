import java.util.Scanner;

public class problem12 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0, i = 1;

            while (i <= n) {
                sum2 += i;
                i++;
            }

            System.out.println("Formula sum = " + sum1);
            System.out.println("While loop sum = " + sum2);
        }
    }
}
