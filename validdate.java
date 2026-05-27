import java.util.Scanner;

public class validatedate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        boolean valid = true;

        if (month < 1 || month > 12) {
            valid = false;
        } else {
            int maxDays;

            if (month == 2) {
                boolean leap = (year % 400 == 0) ||
                              (year % 4 == 0 && year % 100 != 0);

                maxDays = leap ? 29 : 28;
            }
            else if (month == 4 || month == 6 ||
                     month == 9 || month == 11) {
                maxDays = 30;
            }
            else {
                maxDays = 31;
            }

            if (day < 1 || day > maxDays) {
                valid = false;
            }
        }

        if (valid)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");

        sc.close();
    }
}