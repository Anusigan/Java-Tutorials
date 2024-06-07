public class Q2D {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        // Outer loop for the number of rows
        for (int i = rows; i >= 1; i--) {

            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
