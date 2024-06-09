import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Q8 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int number=rand.nextInt(1,20);
        int choice=0;
        while (true){
           System.out.println("Enter a choice: ");
            try{
                 choice=sc.nextInt();
                 if(number==choice){
                System.out.println("Your guess is correct!!");
                break;
                
            }            else{
                System.out.println("Try again !");
            }
        }
            catch(InputMismatchException e){
                System.out.println("Enter a valid integer digit");
                sc.nextLine();
        
        sc.close();
        }
    }
}
}        
    



