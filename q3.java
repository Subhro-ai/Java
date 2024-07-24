import java.util.Scanner;

class q1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for juice or 2 for soda.");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Dispensing juice.");
        }
        else if( input == 2 ) {
            System.out.println("Dispensing soda.");
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}