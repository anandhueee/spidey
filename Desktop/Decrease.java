import java.util.Scanner;

public class Decrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        int decrement = 1;
        while (value > 0) {
            System.out.println( value);
            value -= decrement;
        }
        scanner.close();
    }
}
