import java.util.Scanner;
public class Tasksix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("first number: ");
        int x = scan.nextInt();

        System.out.print("second number: ");
        int y = scan.nextInt();

        System.out.print("third number: ");
        int z = scan.nextInt();

        if (x == y && x == z) {
            System.out.println("All numbers are equal");

        } else if ((x == y) || (x == z) || (z == y)) {
            System.out.println("All numbers are different");

        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}