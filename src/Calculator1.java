import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        int one;
        int two;

        Scanner userInput = new Scanner(System.in);

        try {

        System.out.println("Please enter your first number");
        one = userInput.nextInt();

        System.out.println("Thank you for the first number, please provide the second number which will divide the first number");
        two = userInput.nextInt();

        System.out.println("The answer is: " + one / two);
        }
        catch (ArithmeticException e) {
            System.out.println("Please do not divide with 0, as it's not logical");
        }
        catch (InputMismatchException e) {
            System.out.println("Sorry, i asked you to enter a number not letters");
        }
    }

}
