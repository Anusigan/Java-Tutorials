import java.util.Scanner;
public class Grade{
    public static void main(String[] args ){
        double score=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the score: ");
        score=s.nextDouble();
        if(score>100){
            System.out.println("Invalid value");
        }
        else if (score>70){
            System.out.println("1st Class Honours");

        }
        else if(score>60){
            System.out.println("2nd Class Honours Upper Division");
        }

        else if(score>50){
            System.out.println("2nd Class Honours Lower Division");
        
        }

        else if (score>40){
            System.out.println("3rd Class Honours");
        }

        else {
            System.out.println("Invalid value");
        }

        }


    }
