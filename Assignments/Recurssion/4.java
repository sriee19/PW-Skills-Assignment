public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};

        // Find the sum of the values in the array
        int sum = calculateSum(array);

        // Print the result
        System.out.println("The sum of the values in the array is: " + sum);
    }

    public static int calculateSum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Initialize sum to 0
        int sum = 0;

        // Iterate through the array to calculate the sum
        for (int value : array) {
            sum += value;
        }

        return sum;
    }
}
