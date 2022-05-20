public class Multiplication {
    public static void main(String[] args) {
    multiplier(2);
    }

    public static int multiplier(int userInput) {
        System.out.println("Input a number:");
        int incrementer = 1;
        int multipliedValue = 0;
        while (incrementer <= 10) {
            int totalValue = userInput * incrementer++;
            System.out.println(userInput + " x " + incrementer + " = " + (totalValue));
            multipliedValue += totalValue;
        }
        return multipliedValue;
    }
}