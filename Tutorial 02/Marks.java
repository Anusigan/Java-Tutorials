import java.util.Scanner;
public class Marks{
public static void main(String[] args){
Scanner m=new Scanner(System.in);
System.out.println("Enter the marks for ICT: ");
double ict=m.nextDouble();
Scanner s=new Scanner(System.in);
System.out.println("Enter the marks for CW: ");
double cw=s.nextDouble();
if (ict>=30 && cw>=30){
double fmark=(ict+cw)/2.0;
if (fmark>=40){
System.out.println("PASS");}
else{
System.out.println("FAIL");}
}
else{
System.out.println("FAIL");}
}
}
