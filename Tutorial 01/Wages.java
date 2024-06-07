import java.util.Scanner;
public class Wages{
public static void main(String[] args){
Scanner m=new Scanner(System.in);
System.out.println("Enter the number of manual people: ");
int manual=m.nextInt();
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of Skilled people: ");
int skill=s.nextInt();
Scanner g=new Scanner(System.in);
System.out.println("Enter the number of Management people: ");
int management=g.nextInt();
int twage=(manual*500)+(skill*700)+(management*800);
System.out.println("The total wages of the company is: "+twage);
double tax=0.2*twage;
System.out.println("The approximate tax to pay is: "+tax);
}
}
