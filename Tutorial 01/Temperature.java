import java.util.Scanner;
class Temperature{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the temperature in Centigrade: ");
double c_temp=s.nextFloat();
double f_temp=(9.0/5)*c_temp+32;
System.out.println("The temperature in Fahrenheit is "+(f_temp));
}
}