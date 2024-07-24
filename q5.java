import java.util.Scanner;

class q1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        if (input > 0) {
            System.out.println("The number is positive.");
        }
        else if( input == 0) {
            System.out.println("The number is zero.");
        }
        else if( input < 0 ) {
            System.out.println("The number is negative.");
        }
    }
}