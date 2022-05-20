import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number:");
            int numberInput = scanner.nextInt();

            if(numberInput < 0){
                System.out.println("Number must be a positive number");
                break;
            } else if(numberInput > 0) {
                System.out.println("Number is " + numberInput);
                break;
            } else {
                break;
            }

        }
    }
}