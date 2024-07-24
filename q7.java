import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction.");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sum is : " + (a+b));
                break;
            
                case 2:
                    System.out.println("Difference is : " + (a-b));
                    break;
        
            default:
            System.out.println("Invalid option");
                break;
        }
    }
}
