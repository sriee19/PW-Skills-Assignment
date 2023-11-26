public class MaxValueInArray {
    public static void main(String[] args) {
        int[] array = {13, 1, -3, 22, 5};

        // Find the maximum value in the array
        int maxValue = findMaxValue(array);

        // Print the result
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Initialize max value with the first element of the array
        int max = array[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
