import java.util.Scanner;

public class workk {

    public static void main(String[] args) {
        System.out.println("your x is : ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("your x is " + x);
        gradeCal(x);
    }

    private static void gradeCal(int x) {
        if (x < 50) {
            System.out.println("Grade F");
        } else if (x < 55) {
            System.out.println("Grade D");
        } else if (x < 60) {
            System.out.println("Grade D+");
        } else if (x < 65) {
            System.out.println("Grade C");
        } else if (x < 70) {
            System.out.println("Grade C+");
        } else if (x < 75) {
            System.out.println("Grade B");
        } else if (x < 80) {
            System.out.println("Grade B+");
        } else if (x < 101) {
            System.out.println("Grade A");
        } else if (x > 100) {
            System.out.println("Max x is 100");
            System.out.println("Try again");
        }
    }
}
