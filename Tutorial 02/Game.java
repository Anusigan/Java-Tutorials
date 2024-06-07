import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        while(true){
        System.out.println("\n0 == Rock , 1 == Paper, 2 == Scissors");
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the value : ");
        int choice=s.nextInt();
        int comp= new Random().nextInt(3);
        System.out.println("You Selected: "+choice);
        System.out.println("Computer Selected: " +comp);
        if(choice==0){
            if(comp==0){
                System.out.println("Its a Tie!!");}
            
            else if(comp==1){
                System.out.println("Computer wins");
            }

            else if(comp==2){
                System.out.println("You Won!");
            }


            
        }

        if(choice==1){
            if(comp==0){
                System.out.println("You Won!");
            }
        

            else if(comp==1){
                System.out.println("Its a Tie!!");
            }

            else if(comp==2){
                System.out.println("Computer wins");
            }
        }

        if(choice==2){
            if(comp==0){
                System.out.println("Computer wins");
            }

            if(comp==1){
                System.out.println("You won!!");
            }

            if(comp==2){
                System.out.println("Its a Tie!!)");
            }
        }
    }


    }
}
