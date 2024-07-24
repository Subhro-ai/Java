import java.util.Scanner;

class q6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mark");
        int input = scanner.nextInt();
        String grade;
        switch (input / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                if (input >= 0 && input < 60) {
                    grade = "F";
                } else {
                    grade = "Invalid";
                }
                break;
        }
        System.out.println("YOur grade is : " + grade);
    }
}