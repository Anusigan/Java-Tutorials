import java.util.Arrays;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index 01: ");
        int index1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the index 02: ");
        int index2=sc.nextInt();
        sc.nextLine();
        String name= array[index1];
        array[index1]=array[index2];
        array[index2]=name;
        System.out.println(Arrays.toString(array));

    }
}
