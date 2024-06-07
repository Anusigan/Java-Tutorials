import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        sc.nextLine();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("Factorial of 0 is 1.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by the current value of i
            }
            System.out.print("Factorial of " + number + " = " + number);
            for (int i = number - 1; i >= 1; i--) {
                System.out.print(" x " + i); 
            }
            System.out.println(" = " + factorial + ".");

        }
        sc.close();
    }
}
