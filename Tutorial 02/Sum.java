import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner i=new Scanner(System.in);
System.out.println("Enter the number 1: ");
double num1=i.nextDouble();
Scanner m=new Scanner(System.in);
System.out.println("Enter the number 2: ");
double num2=m.nextDouble();
double result=num1+num2;
System.out.println("The sum is: "+result);
}
}
