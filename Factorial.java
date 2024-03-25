import java.util.*;

public class Factorial{
    public static void main(String[] args){

        int number;
        int factorialTotal = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = input.nextInt();

        input.close();

        for (int i=1; i <= number; i++)
        {
            factorialTotal *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorialTotal + ".");

    }
}