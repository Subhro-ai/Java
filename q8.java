import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = sc.nextInt();
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println(y + " is a leap year.");
                } else {
                    System.out.println(y + " is not a leap year.");
                }
            } else {
                System.out.println(y + " is a leap year.");
            }
        } else {
            System.out.println(y + " is not a leap year.");
        }
    }
}
