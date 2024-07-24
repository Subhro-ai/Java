import java.util.Scanner;

class q4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int input = scanner.nextInt();
        if (input >= 30) {
            System.out.println("It's hot!");
        }
        else if( input >= 20 && input < 30 ) {
            System.out.println("It's warm.");
        }
        else if( input >= 10 && input < 20 ) {
            System.out.println("It's cool.");
        }
        else {
            System.out.println("It's cold.");
        }
    }
}