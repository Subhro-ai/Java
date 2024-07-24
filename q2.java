import java.util.Scanner;

class q2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int input = scanner.nextInt();
        if (input >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}