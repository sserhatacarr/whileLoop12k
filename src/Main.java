import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, total = 0, counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        k = input.nextInt();

        int i = 0;
        while (i <= k) {
            // If i is divisible by both 3 and 4
            if (i % 3 == 0 && i % 4 == 0) {
                counter++; // Increment the counter
                total += i; // Update the total
            }
            i++; // Move to the next number
        }

        if (counter == 0) {
            System.out.println("There are no numbers divisible by both 3 and 4 in the given range.");
        } else {
            // Calculate and print the average
            System.out.println("Average = " + (double) total / counter);
        }
    }
}
