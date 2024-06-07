import java.util.Scanner;
public class Converter{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the length in metres: ");
Float m_length=s.nextFloat();
Float cm_length=m_length*100;
System.out.println("The length in cm is: "+(cm_length)+"cm");
}
}

