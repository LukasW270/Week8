import java.util.*;

public class OddSum {
    public static void main(String[] args){

        int number;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        input.close();

        for (int i = 1; i <= number; i = i + 2)
        {
            sum += i;
        }

        System.out.println("The sum of the odd numbers from 1 to " + number + " is " + sum + ".");

    }
}
