import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sq = n * n;

        int temp = sq;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int divisor = (int)Math.pow(10, digits / 2);

        int right = sq % divisor;
        int left = sq / divisor;

        if (left + right == n)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");

        sc.close();
    }
}