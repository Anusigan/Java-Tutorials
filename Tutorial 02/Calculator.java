import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        int result=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1=s.nextInt();
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number 2: ");
        int num2=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the operator: ");
        String op=b.nextLine();
        
        
        switch(op){
            case "+":{
                result=num1+num2;
                break;
            }

            case ("-"):{
                result=num1-num2;
                break;
            }

            case("*"):{
                result=num1*num2;
                break;
            }

            case("/"):{
                result=num1/num2;
                break;
            }

    

        
        }
        System.out.println("The result is: " +result);
        
    

    }
    
}

