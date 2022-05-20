public class CountToEleven {
    public static void main(String[] args) {

    }

    public static int counter(int userInput) {

        System.out.println("Enter a number less than 11");

        int sum = 0;
        while (userInput <= 11) {
            System.out.println(userInput);
            sum += userInput++;
        }
        System.out.println(sum);
        return sum;

    }

}