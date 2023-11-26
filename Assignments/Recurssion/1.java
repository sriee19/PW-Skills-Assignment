public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 3; 
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
        } else {
            solveHanoi(n - 1, source, destination, auxiliary);

            System.out.println("Move disk " + n + " from " + source + " to " + destination);

            solveHanoi(n - 1, auxiliary, source, destination);
        }
    }
}
