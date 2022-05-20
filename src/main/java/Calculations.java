import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int number2 = scanner.nextInt();
        double division = ((double)number1 / (double)number2);

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));

    }
}