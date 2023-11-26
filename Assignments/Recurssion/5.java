import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isArmstrong = isArmstrongNumber(number);

        if (isArmstrong) {
            System.out.println("Yes, " + number + " is an Armstrong number.");
        } else {
            System.out.println("No, " + number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
