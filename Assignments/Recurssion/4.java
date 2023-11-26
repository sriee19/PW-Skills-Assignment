public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};

        int sum = calculateSum(array);

        System.out.println("The sum of the values in the array is: " + sum);
    }

    public static int calculateSum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum;
    }
}
