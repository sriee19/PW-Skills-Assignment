import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);

        // Output: Print the result
        if (isArmstrong) {
            System.out.println("Yes, " + number + " is an Armstrong number.");
        } else {
            System.out.println("No, " + number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int num) {
        // Count the number of digits in the given number
        int originalNum = num;
        int numDigits = String.valueOf(num).length();

        // Calculate the sum of each digit raised to the power of the total digits
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }
}
