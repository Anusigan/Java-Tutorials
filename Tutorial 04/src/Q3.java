import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Q3 {
    public static void main(String[] args)  {

        try {
            double[] numbers = new double[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index for i: ");
            int indexi = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the index for j: ");
            int indexj = sc.nextInt();
            sc.nextLine();
            numbers[indexi] = indexi;
            numbers[indexj] = indexj;
            System.out.println(Arrays.toString(numbers));

        }
        catch(Exception e){
            System.out.println("wrong");

        }


        finally {
            System.out.println("try catch");
        }


    }
}
